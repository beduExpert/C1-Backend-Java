package com.example.demo;

import lombok.Data;

import java.util.List;

@Data
public class AvailableBooks {
    Boolean success;
    List<Book> payload;
}
