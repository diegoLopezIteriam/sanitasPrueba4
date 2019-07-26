################
INSTRUCCIONES
##############
Se necesita jdk 1.8 y maven 3.6 o superior

Para añadir el tracer a la carpeta m2 del usuario se lanza el siguiente comando desde la ubicación del jar:
mvn install:install-file -Dfile=tracer-1.0.0.jar -DgroupId=io.corp.calculator -DartifactId=tracer -Dversion=1.0.0 -Dpackaging=jar

Generar el jar:
mvn clean install

Arrancar el microservicio:
java -jar target/sanitas-test4-1.0.0.jar

################
ANÁLISIS
##############
Se plantea una aplicación spring boot de microservicios con endpoints para las distintas operaciones.
Utilizaremos distintos POJOs con la intención de tener nombres amigables relativos a cada operación

Las peticiones se recogerán en un controlador que informará de los datos recibidos en el log para, si fuera necesario
tener constancia de las E/S al microservicio

Las operaciones se realizarán en servicios, separando la lógica de operación de la capa superior del controlador API

En un principio, al no plantearse salida a fichero, base de datos, o llamadas a servicios externos, no se plantea una capa de modelo

Se plantea validar la entrada con javax validation, que con anotaciones sencillas es capaz de interceptar la petición
y devolver errores con mensajes personalizados o por defecto que informarán del problema

Se realizarán test unitarios para verificar resultados de los servicios así como entradas incorrectas o nulas al servicio.
Al plantearse validaciones con anotaciones, se invocará al controlador mediante peticiones http

El último paso sería diseñar una interfaz de errores con códigos genéricos HTTP o internos de la aplicación
para facilitar el seguimiento de posibles errores controlados y no controlados

Se utilizará sonarLint para asegurar la calidad del código implementado

Soy consciente que sería adecuado en uno de los primeros pasos haber renombrado el paquete con un nombre más aparente (cuanto más tarde, más costoso),
pero preferí invertir el tiempo en otras tareas con más interés de cara a calidad de código o diseño
