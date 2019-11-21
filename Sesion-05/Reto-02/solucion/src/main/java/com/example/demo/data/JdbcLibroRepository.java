package com.example.demo.data;

import com.example.demo.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcLibroRepository implements LibroRepository{
    // inyección de dependencias
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Iterable<Libro> encuentraTodos() {
        return jdbcTemplate.query("select * from libro", this::mapRowToLibro);
    }

    private Libro mapRowToLibro(ResultSet resultSet, int rowNum) throws SQLException {
        return new Libro(
                resultSet.getString("titulo"),
                resultSet.getString("autor")
        );
    }
}
