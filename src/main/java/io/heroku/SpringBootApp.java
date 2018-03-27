package io.heroku;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp {

    public static void main(String[] args) throws Exception {
        new SpringApplication(SpringBootApp.class).run(args);
    }

}
