
# Usamos una imagen oficial de Java 22 
FROM eclipse-temurin:22-jre

# Carpeta donde vivirá la app dentro del contenedor
WORKDIR /app

# Copiamos el jar generado por Maven
COPY target/juegoCommandYMemento-1.0-SNAPSHOT.jar app.jar

# Comando para ejecutar el jar
CMD ["java", "-jar", "app.jar"]
