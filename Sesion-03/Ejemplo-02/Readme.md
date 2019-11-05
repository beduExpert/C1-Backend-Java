## Sirviendo aplicaciones

### OBJETIVO

Levantar un servidor tomcat y responder peticiones.

#### REQUISITOS

Un proyecto de spring boot con la dependencia Spring Web.

#### DESARROLLO

Una vez que descarguemos el proyecto de spring boot configurado con initializr con la dependencia Spring Web lo abrimos en IntelliJ IDEA y corremos la aplicación.

![Tomcat Spring](springtomcat.png)

Como vemos spring boot automaticamente inicia un servidor Tomcat el cual podemos usar para servir peticiones HTTP.

Ahora creamos un controlador para servir peticiones `GET` a la ruta `/` y registramos la clase por medio de una anotación de spring `@RestController` y le asignamos la ruta `/` por medio de `@RequestMapping` como podemos ver en [Controlador.java](demo/src/main/java/com/example/demo/Controlador.java)

Ahora podemos hacer metodos que respondan a las rutas `/` y `/saluda/nombre` con metodos `GET`

![Get mappings](getmappings.png)

Volvemos a correr la aplicación y ahora podemos hacer peticiones `GET` usando nuestro navegador. En el navegador visitamos `http://localhost:8080/` y luego visitamos `http://localhost:8080/saluda/juan` y `http://localhost:8080/saluda/pedro`.

