package guru.springframework.joke.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokeappApplication {

    // @ImportResource annotation is part of XML based configuration
    // chuck-config.xml is part of XML based configuration which is added inside resources

    public static void main(String[] args) {
        SpringApplication.run(JokeappApplication.class, args);
    }

}
