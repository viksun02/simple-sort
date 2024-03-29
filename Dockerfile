FROM openjdk:21-jdk-slim

WORKDIR /app

COPY src/Main.java /app/
COPY src/sort/SimpleSelectionSort.java /app/sort/

RUN javac Main.java 

CMD ["java", "-cp", ".", "Main"]
