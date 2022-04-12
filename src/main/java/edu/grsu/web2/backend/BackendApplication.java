package edu.grsu.web2.backend;

import edu.grsu.web2.backend.entity.Issue;
import edu.grsu.web2.backend.entity.Status;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class BackendApplication implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Issue.class, Status.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

}
