package maxlogic.springframework.sfgdi.controller;

import maxlogic.springframework.sfgdi.services.GreetingServiceConstructorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;
    @BeforeEach
    void setup(){
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceConstructorImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}