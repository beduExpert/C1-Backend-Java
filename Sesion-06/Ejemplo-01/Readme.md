##  Spring RestTemplate

### OBJETIVO

Usar RestTemplate

#### REQUISITOS

Un proyecto de spring boot creado con initializr con las dependencias `Spring Web` y `Lombok`

#### DESARROLLO

Una vez abierto el proyecto en el IDE creamos una clase que lo unico que hará será registrar beans en el contenedor de spring [ProveoBeans.java](demo/src/main/java/com/example/demo/ProveoBeans.java) y aqui registramos un bean que proveerá una RestTemplate, esta clase nos ayudara a hacer peticiones a una API REST.

Para este ejemplo harémos una petición `GET` a la url `https://api.bitso.com/v3/available_books/`. Para recibir la respuesta crearemos dos clases que modelan el objeto `JSON` que nos regresa este endpoint [AvailableBooks.java](demo/src/main/java/com/example/demo/AvailableBooks.java) y [Book.java](demo/src/main/java/com/example/demo/Book.java) con estas dos clases RestTemplate hará el parseo y podremos tratar la respuesta como objetos de java.

Por último para probar todo y usar `RestTemplate` hacemos un `CommandLineRunner` en [DemoApplication.java](demo/src/main/java/com/example/demo/DemoApplication.java) el cual usa `RestTemplate` y el método `getForObject` para hacer una petición `GET` y toma como argumento la url a donde queremos hacer la petición y la clase que se usará para parsear la respuesta. Por ultimo logeamos la respuesta con log, notemos que usamos la anotación `@Slf4j` para obtener un logger y la anotacion `@Data` para generar de manera automatica los setters/getters y conversión a string de nuestras clases.

![respuesta](respuesta.png)

