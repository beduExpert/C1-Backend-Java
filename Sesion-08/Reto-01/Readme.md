## Obtener datos de una api

### OBJETIVO 

Obtener datos de la api de binance

#### REQUISITOS 

El código del ejemplo 3

#### DESARROLLO

- Hacer una clase que modele la información recibida por el endpoint [/api/v3/ticker/24hr](https://github.com/binance-exchange/binance-official-api-docs/blob/master/rest-api.md#24hr-ticker-price-change-statistics).

- Modificar el código del ejemplo 3 en el archivo `Colector.java` para agregar una tarea programada que cada 10 segundos haga una peticion `GET` al endpoint [/api/v3/ticker/24hr](https://github.com/binance-exchange/binance-official-api-docs/blob/master/rest-api.md#24hr-ticker-price-change-statistics) con `symbol` igual a `BTCUSDT`.

- Logear `count` dentro de la tarea programada

