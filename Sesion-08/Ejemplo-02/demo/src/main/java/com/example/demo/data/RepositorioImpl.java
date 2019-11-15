package com.example.demo.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class RepositorioImpl implements Repositorio {
    /***
     * Inyección de dependencias
     * como tenemos a JDBC API y H2 como dependencia
     * spring boot nos dará una instancia de un JdbcTemplate
     */
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void guardaTransaccion(Transaccion transaccion) {
        jdbcTemplate.update("insert into transaccion(id, price, qty, quoteQty, time, isBuyerMaker, isBestMatch) values (?,?,?,?,?,?,?)",
                transaccion.getId(),
                transaccion.getPrice(),
                transaccion.getQty(),
                transaccion.getQuoteQty(),
                transaccion.getTime(),
                transaccion.getIsBuyerMaker(),
                transaccion.getIsBestMatch()
                );
    }

    @Override
    public List<Transaccion> obtenerTransacciones() {
        return jdbcTemplate.query("select * from transaccion", this::mapRowToTransaccion);
    }

    private Transaccion mapRowToTransaccion(ResultSet resultSet, int rowNum) throws SQLException {
        return new Transaccion(
                resultSet.getLong("id"),
                resultSet.getString("price"),
                resultSet.getString("qty"),
                resultSet.getString("quoteQty"),
                resultSet.getLong("time"),
                resultSet.getBoolean("isBuyerMaker"),
                resultSet.getBoolean("isBestMatch")
        );
    }
}
