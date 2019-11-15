package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Component // registramos la clase como un bean en el contenedor de spring
@Slf4j // anotación para usar el logger
public class Colector {
    @Autowired // obtenemos una RestTemplate del contenedor y lo inyectamos
    RestTemplate restTemplate;

    // exchange de criptomonedas
    static final String baseUrl = "https://api.binance.com";
    // mercado de (true) usd del bitcoin
    static final String symbol = "BTCUSDT";

    // cada 5 minutos
    @Scheduled(fixedRate = 60*5000)
    /* vamos a obtener la lista de transacciones mas recientes
       https://github.com/binance-exchange/binance-official-api-docs/blob/master/rest-api.md#recent-trades-list
     */
    public void obtenTransacciones() {
        // construimos la url, necesitamos la url base, el endpoint y el parametro
        UriComponents builder = UriComponentsBuilder.fromHttpUrl(baseUrl+"/api/v3/trades")
                .queryParam("symbol", symbol).build();

        // hacemos la petición GET usando la url construida y la clase con la que se hará el parseo
        Transaccion[] transacciones =
                restTemplate.getForObject(builder.toString(), Transaccion[].class);

        // logemos algo, solo para confirmar
        for(Transaccion transaccion: transacciones) {
            log.info("{}", transaccion.getPrice());
        }
    }
}
