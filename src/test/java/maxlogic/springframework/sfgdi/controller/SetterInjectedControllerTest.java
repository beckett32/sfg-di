package maxlogic.springframework.sfgdi.controller;

import maxlogic.springframework.sfgdi.services.GreetingServiceConstructorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceConstructorImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}