CREATE TABLE IF NOT EXISTS cita (
    nombre VARCHAR(128) NOT NULL,
    libro VARCHAR(128) NOT NULL,
    texto VARCHAR(4096) NOT NULL
);

CREATE TABLE IF NOT EXISTS libro (
    titulo VARCHAR(128) NOT NULL,
    autor VARCHAR(128) NOT NULL
);
