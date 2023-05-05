FROM amazoncorretto:17

MAINTAINER DarioRv

COPY target/PortfolioAPI-0.0.1-SNAPSHOT.jar PortfolioAPI-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/PortfolioAPI-0.0.1-SNAPSHOT.jar"]