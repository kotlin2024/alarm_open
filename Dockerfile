FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/alarm_open-0.0.1-SNAPSHOT.jar /app/alarm_open.jar

# 환경 변수 설정
ENV SPRING_DATASOURCE_URL=jdbc:postgresql://aws-0-ap-northeast-2.pooler.supabase.com:6543/postgres
ENV SPRING_DATASOURCE_USERNAME=postgres.vloidcrotvrhbkdpgmrb
ENV SPRING_DATASOURCE_PASSWORD=RRWIBxidxH81czex

ENTRYPOINT ["java", "-jar", "/app/alarm_open.jar"]
