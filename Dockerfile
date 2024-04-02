# Use a imagem base do OpenJDK 17
FROM openjdk:17-jdk-slim

# Diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo JAR da aplicação
COPY target/caseJava1-0.0.1-SNAPSHOT.jar app.jar

# Comando para iniciar a aplicação Spring Boot
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]
