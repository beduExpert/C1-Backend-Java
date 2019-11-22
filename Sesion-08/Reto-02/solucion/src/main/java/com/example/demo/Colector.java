package com.example.demo;

import com.example.demo.data.Informacion;
import com.example.demo.data.Repositorio;
import com.example.demo.data.Transaccion;
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

    @Autowired
    Repositorio repositorio;

    // exchange de criptomonedas
    static final String baseUrl = "https://api.binance.com";
    // mercado de (true) usd del bitcoin
    static final String symbol = "BTCUSDT";

    // cada 5 segundos
    @Scheduled(fixedRate = 5000)
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

        // guardamos las transacciones en la base de datos
        for(Transaccion transaccion: transacciones) {
            repositorio.guardaTransaccion(transaccion);
        }
    }

    // obtenemos la el numero de trades en las ultimas 24h
    @Scheduled(fixedRate = 10000)
    public void obtenerNumeroTrades() {
        UriComponents builder = UriComponentsBuilder.fromHttpUrl(baseUrl+"/api/v3/ticker/24hr")
                .queryParam("symbol", symbol).build();

        Informacion informacion =
                restTemplate.getForObject(builder.toString(), Informacion.class);

        repositorio.guardarNumeroTrades(informacion);
    }
}
