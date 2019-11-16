## Procesar los datos y exponerlos por una api rest

### OBJETIVO

Procesar los datos obtenidos y exponer el resultado por medio de una api rest.

#### REQUISITOS

El código del ejemplo 2

#### DESARROLLO

Con los precios que obtuvimos en el ejemplo 1 y guardamos en el ejemplo 2 vamos a calcular el precio promedio y expondremos este resultado mediante una api rest en el endpoint `/promedio` con el método `GET` para esto creamos [MiControlador.java](demo/src/main/java/com/example/demo/MiControlador.java).

Podemos consultar este endpoint usando el navegador web visitando `http://localhost:8080/promedio`.

![endpoint](endpoint.png)

