package maxlogic.springframework.sfgdi.controller;

import lombok.Setter;
import maxlogic.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    private GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreetting();
    }
    @Autowired
    public void setGreetingService(@Qualifier("greetingServiceSetterImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
