FROM openjdk:17

EXPOSE 8082

WORKDIR /app

ENV SCOPE="prod"
ENV DB_MY="jdbc:mysql://db2:3306/banco"

COPY build/libs/address-1.0.jar /app/address.jar

ENTRYPOINT ["java", "-jar", "address.jar"]
