package maxlogic.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceSetterImpl implements GreetingService{
    @Override
    public String sayGreetting() {
        return "Hello World Setter!!!";
    }
}
