package com.example.demo.data;

import com.example.demo.Cita;

public interface CitaRepository {
    Iterable<Cita> encuentraTodos();
    Cita guardar(Cita cita);
}
