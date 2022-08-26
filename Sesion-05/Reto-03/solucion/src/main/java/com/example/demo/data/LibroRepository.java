package com.example.demo.data;

import com.example.demo.Libro;

public interface LibroRepository {
    Iterable<Libro> encuentraTodos();
}
