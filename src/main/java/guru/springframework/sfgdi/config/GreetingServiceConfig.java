package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Profile("EN")
    @Bean
    I18EnglishGreetingService i18nService(){
        return new I18EnglishGreetingService();
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18SpanishGreetingService i18nSpanishService(){
        return new I18SpanishGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingsService primaryGreetingsService(){
        return new PrimaryGreetingsService();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetService setterInjectedGreetService(){
        return new SetterInjectedGreetService();
    }
}
