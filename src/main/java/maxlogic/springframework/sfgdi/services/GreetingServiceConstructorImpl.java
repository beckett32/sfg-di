package maxlogic.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceConstructorImpl implements GreetingService{
    @Override
    public String sayGreetting() {
        return "Hello World Constructor !!!";
    }
}
