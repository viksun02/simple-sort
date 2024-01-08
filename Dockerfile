FROM openjdk:21-jdk-slim

WORKDIR /app

COPY out/artifacts/basicSort_jar/basicSort.jar .
COPY src/sort/SimpleSelectionSort.java /app/sort/

CMD ["java", "-cp", "basicSort.jar", "Main"]