FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

# Make mvnw executable
RUN chmod +x mvnw

# Build Spring Boot jar
RUN ./mvnw clean package -DskipTests

# Debug: show jar files (helps confirm build)
RUN ls -l target

EXPOSE 8080

# ✅ SHELL FORM CMD (wildcard works here)
CMD java -jar target/*.jar
