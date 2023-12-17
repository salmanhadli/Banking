package com.project.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.project.accounts.controller") })
@EnableJpaRepositories("com.project.accounts.repository")
@EntityScan("com.project.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(info = @Info(title = "Accounts microservice REST API Documentation", description = "SALMAN Accounts microservice REST API Documentation", version = "v1", contact = @Contact(name = "Salman Hadli", email = "skh174211@gmail.com", url = "https://www.linkedin.com/in/salmanhadli"), license = @License(name = "Apache 2.0", url = "https://www.linkedin.com/in/salmanhadli")), externalDocs = @ExternalDocumentation(description = "SALMAN's Accounts microservice REST API Documentation", url = "https://www.linkedin.com/in/salmanhadli"))
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
