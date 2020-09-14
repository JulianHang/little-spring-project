package tech.zlia.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan
@ImportResource("classpath:test.xml")
public class LittleSpringProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(LittleSpringProjectApplication.class, args);
    }

}
