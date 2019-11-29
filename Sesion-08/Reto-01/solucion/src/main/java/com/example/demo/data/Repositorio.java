package com.example.demo.data;

import java.util.List;

public interface Repositorio {
    void guardaTransaccion(Transaccion transaccion);
    List<Transaccion> obtenerTransacciones();
}
