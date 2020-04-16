package com.example.demo.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

public class Transaccion {
    public Transaccion(Long id, String price, String qty, String quoteQty, Long time, Boolean isBuyerMaker, Boolean isBestMatch) {
        this.id = id;
        this.price = price;
        this.qty = qty;
        this.quoteQty = quoteQty;
        this.time = time;
        this.isBuyerMaker = isBuyerMaker;
        this.isBestMatch = isBestMatch;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getQuoteQty() {
        return quoteQty;
    }

    public void setQuoteQty(String quoteQty) {
        this.quoteQty = quoteQty;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Boolean getBuyerMaker() {
        return isBuyerMaker;
    }

    public void setBuyerMaker(Boolean buyerMaker) {
        isBuyerMaker = buyerMaker;
    }

    public Boolean getBestMatch() {
        return isBestMatch;
    }

    public void setBestMatch(Boolean bestMatch) {
        isBestMatch = bestMatch;
    }

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
