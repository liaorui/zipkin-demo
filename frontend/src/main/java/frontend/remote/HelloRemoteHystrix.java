package frontend.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String printDate(@RequestParam(name = "username", required = false) String username) {
        return "Sorry, " + username + ", there is a error";
    }
}
