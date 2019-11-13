package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

// Con esta anotación le decimos a spring que registre
// esta clase en el contenedor como un bean
@Component
@Slf4j // anotación para obtener un logger
public class TareaProgramada {
    @Autowired
    RestTemplate restTemplate;

    // Una request GET sin parametros
    @Scheduled(fixedRate = 30000) // cada 30 segundos
    public void getBooks() {
        AvailableBooks availableBooks =
                restTemplate.getForObject("https://api.bitso.com/v3/available_books/", AvailableBooks.class);

        // logeamos toda la respuesta
        log.info(availableBooks.toString());

        // logeamos la información que nos interese
        for(Book book: availableBooks.getPayload()) {
            log.info("book {}: maximum price: ${}", book.getBook(), book.getMaximum_price());
        }
    }

    // Una request GET con parametros
    @Scheduled(fixedRate = 30000)
    public void getTicker() {
        // construimos la url
        String uri = "https://api.bitso.com/v3/ticker/";

        UriComponents builder = UriComponentsBuilder.fromHttpUrl(uri)
                .queryParam("book", "btc_mxn").build();

        // esto nos da como resultado https://api.bitso.com/v3/ticker/?book=btc_mxn

        TickerResponse tickerResponse =
                restTemplate.getForObject(builder.toUriString(), TickerResponse.class);

        // logeamos la información que nos interesa
        log.info("{} cambio ${} en las ultimas 24 horas", tickerResponse.getPayload().getBook(), tickerResponse.getPayload().change_24);
    }
}
