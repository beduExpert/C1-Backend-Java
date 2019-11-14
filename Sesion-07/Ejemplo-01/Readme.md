## Peticiones GET

### OBJETIVO

Servir peticiones `GET` con y sin parametros

#### REQUISITOS

Un proyecto de spring boot creado con initializr y las dependencias `Lombok` y `Spring Web`

#### DESARROLLO

Con el proyecto abierto en el IDE vamos a crear un controlador nuevo [MiControlador.java](demo/src/main/java/com/example/demo/MiControlador.java). Lo anotamos con `@RestController` y con `@RequestMapping(produces = {"application/json"})` y ligamos métodos con rutas con la anotación `@GetMapping`.

Vamos a trabajar con objetos de java pero como le indicamos a spring que queremos regresar `JSON` se hará cargo de hacer la conversión.

Una vez corramos la aplicación podemos hacer peticiones `GET` usando nuestro navegador y visitando la ruta adecuada. Por ejemplo para la ruta `/saluda/Vicfred` visitamos `http://localhost:8080/saluda/Vicfred`.

![saluda](saluda.png)

