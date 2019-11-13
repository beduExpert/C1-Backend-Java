package com.example.demo;

import lombok.Data;

@Data
public class TickerResponse {
    Boolean success;
    Ticker payload;
}
