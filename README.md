<h1 align="center">
  Email Spring Boot
</h1>

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Email](https://docs.spring.io/spring-framework/reference/integration/email.html)

## Como Executar

- Clonar repositório git:
  ```
  git clone https://github.com/LuisWilke/email-springboot.git
  ```

- Construir o projeto:
  ```
  ./mvnw clean package
  ```

- Configurar credenciais do servidor de email

- Executar:
  ```
  java -jar ./target/email-springboot-0.0.1-SNAPSHOT.jar
  ```

- Testar ( com [httppie](https://httpie.io) ):
  ```
  http POST :8080/email to="wilkellopes@email.com" subject="demo spring mail" body="it's alive"
  ```
