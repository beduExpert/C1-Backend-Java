package com.example.demo;

import lombok.Data;

@Data // anotación de lombok para generar setters/getters y constructores
public class Transaccion {
    // estos campos tienen el mismo nombre y tipo que el JSON de respuesta
    // por ejemplo:
    /*
    [
      {
        "id": 28457,
        "price": "4.00000100",
        "qty": "12.00000000",
        "quoteQty": "48.000012",
        "time": 1499865549590,
        "isBuyerMaker": true,
        "isBestMatch": true
      }
    ]
     */
    Long id;
    String price;
    String qty;
    String quoteQty;
    Long time;
    Boolean isBuyerMaker;
    Boolean isBestMatch;
}
