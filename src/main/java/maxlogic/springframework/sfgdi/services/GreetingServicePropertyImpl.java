package maxlogic.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePropertyImpl implements GreetingService{
    @Override
    public String sayGreetting() {
        return "Hello World Property!!!";
    }
}
