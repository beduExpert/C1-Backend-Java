package com.example.demo.data;

import com.example.demo.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

// con esta anotación le decimos a spring
// que guarde esta clase en su contenedor como un bean
@Repository
public class JdbcCitaRepository implements CitaRepository{
    // necesitamos un jdbc template
    private JdbcTemplate jdbc;

    // inyección de dependencias
    // el contenedor de spring nos da un JdbcTemplate
    @Autowired
    public JdbcCitaRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Iterable<Cita> encuentraTodos() {
        return jdbc.query("select * from cita",
                this::mapRowToCita);
    }

    // esta funcion transforma lo que nos regresa la base de datos
    // en un objeto de la clase Cita
    private Cita mapRowToCita(ResultSet resultSet, int rowNum) throws SQLException {
        return new Cita(
                resultSet.getString("nombre"),
                resultSet.getString("libro"),
                resultSet.getString("texto")
        );
    }

    @Override
    public Cita guardar(Cita cita) {
        jdbc.update("insert into Cita(nombre, libro, texto) values (?, ?, ?)",
                cita.getNombre(),
                cita.getLibro(),
                cita.getTexto());
        return cita;
    }
}
