package com.example.demo;

import com.example.demo.data.Informacion;
import com.example.demo.data.Repositorio;
import com.example.demo.data.Transaccion;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class MiControlador {
    @Autowired
    private final Repositorio repositorio;

    /***
     *
     * @return el precio promedio de las transacciones que hemos guardado
     */
    @GetMapping(path = "/promedio", produces = "application/json")
    public String promedio() {
        // obtenemos las transacciones
        List<Transaccion> transacciones = repositorio.obtenerTransacciones();

        // calculamos el promedio
        Double promedio = 0.0;
        int numero = 0;
        for(Transaccion transaccion: transacciones) {
            numero += 1;
            promedio += Double.valueOf(transaccion.getPrice());
        }

        // le damos formato a la respuesta
        // esta vez usamos un mapa pero podemos usar una clase que modele la respuesta JSON
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("promedio", String.valueOf(promedio/numero));

        ObjectMapper objectMapper = new ObjectMapper();

        String json = "";
        try {
            json = objectMapper.writeValueAsString(respuesta);
        } catch (Exception e) {}

        return json;
    }

    @GetMapping(path = "/numeroTrades", produces = "application/json")
    public String numeroTrades() {
        Informacion informacion = repositorio.obtenerNumeroTrades();

        Map<String, Long> respuesta = new HashMap<>();
        respuesta.put("numeroTrades", informacion.getCount());

        ObjectMapper objectMapper = new ObjectMapper();

        String json = "";
        try {
            json = objectMapper.writeValueAsString(respuesta);
        } catch (Exception e) {}

        return json;
    }
}
