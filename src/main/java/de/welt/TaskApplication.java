package de.welt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }

    @RestController
    public class Controller {
        @GetMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
        public String index() {
            return "{ \"hello\": \"world\"}";
        }
    }
}
