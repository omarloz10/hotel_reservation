# ============================
# Etapa 1: Build con Java 21 + Maven
# ============================
FROM eclipse-temurin:21-jdk-jammy AS builder
WORKDIR /app

# Instalar Maven
RUN apt-get update && apt-get install -y maven git && rm -rf /var/lib/apt/lists/*

# Copiar pom y descargar dependencias
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copiar código fuente y compilar
COPY src ./src
RUN mvn clean package -DskipTests

# ============================
# Etapa 2: Runtime
# ============================
FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app

# Copiar el JAR compilado
COPY --from=builder /app/target/*.jar hotel_app.jar

EXPOSE ${SPRING_PORT}
ENTRYPOINT ["java","-jar","hotel_app.jar"]
