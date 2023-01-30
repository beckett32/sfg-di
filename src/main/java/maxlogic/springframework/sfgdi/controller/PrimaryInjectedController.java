package maxlogic.springframework.sfgdi.controller;

import maxlogic.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryInjectedController {

    private final GreetingService greetingService;

    public PrimaryInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        //System.out.println(String.format("Hello %s !!!", data));

        return greetingService.sayGreetting();
    }
}
