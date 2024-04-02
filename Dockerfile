# Use a imagem base do OpenJDK 17 com Maven
FROM maven:3.8-openjdk-17-slim AS maven

# Diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia apenas o arquivo pom.xml para aproveitar o cache de dependências
COPY pom.xml .

# Baixa as dependências do Maven, mas não executa o build do projeto
RUN mvn -B dependency:go-offline

# Copia o restante dos arquivos do projeto
COPY src src

# Executa o build do projeto
RUN mvn -B package -DskipTests

# Imagem final com apenas a aplicação
FROM openjdk:17-jdk-slim

# Diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo JAR da aplicação a partir do estágio de construção anterior
COPY --from=maven /app/target/caseJava1-0.0.1-SNAPSHOT.jar app.jar

# Comando para iniciar a aplicação Spring Boot
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]
