local host 9090 serve as api gateway from which you can get the data of Quiz service.
Where Quiz service is made as Feign Client req for Questions from Question service.
Eureka Discovery server is used to get the instance of Quiz and Question services make them as client.
Using Spring Cloud Api Gateway route the both service from 8086, 8082 to 9090 which will be common gateway for both the services.



create Jar file of services to run in Command CLI

java -jar Question-Service-0.0.1-SNAPSHOT.jar = 8086
java -jar Quiz-Service-0.0.1-SNAPSHOT.jar = 8082


"localhost:9090/question" = question data
"localhost:9090/quiz" = quiz data


Use LoadBalancer to multiple instances
