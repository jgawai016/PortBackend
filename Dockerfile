# Java 17 base image
FROM eclipse-temurin:17-jdk

# Working directory
WORKDIR /app

# Copy all files
COPY . .

# ✅ IMPORTANT: make mvnw executable
RUN chmod +x mvnw

# Build Spring Boot app
RUN ./mvnw clean package -DskipTests

# Expose port (Spring Boot default)
EXPOSE 8080

# Run application
CMD ["java", "-jar", "target/*.jar"]
