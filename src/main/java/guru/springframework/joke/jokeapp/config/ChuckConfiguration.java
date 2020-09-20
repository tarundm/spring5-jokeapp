package guru.springframework.joke.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// ChuckNorrisQuotes is modified to demo Java based configuration.
// @Configuration is part of java based configuration
// @Configuration
public class ChuckConfiguration {

    // Method name does not matter. it can be getChuckNorrisQuotes() or ChuckNorrisQuotes()
    // This is annotated with Bean so it will be available to entire project this is often
    // used for external jars and where team works on source which we don't have direct access to.

    // @Bean annotation is part of java based configuration
    // @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

    // Java based configuration - once we comment these annotations, spring does not see this class
    // as configuration class.

}
