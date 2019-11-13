package com.example.demo;

import lombok.Data;

@Data
public class Ticker {
    String book;
    String volume;
    String high;
    String last;
    String low;
    String vwap;
    String ask;
    String bid;
    String created_at;
    String change_24;
}
