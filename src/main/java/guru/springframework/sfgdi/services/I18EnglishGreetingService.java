package guru.springframework.sfgdi.services;


public class I18EnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
