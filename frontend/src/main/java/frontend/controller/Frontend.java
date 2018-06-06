package frontend.controller;

import frontend.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin // So that javascript can be hosted elsewhere
public class Frontend {
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/")
    public String callBackend(@RequestParam(name = "username", required = false) String username) {
        return helloRemote.printDate(username);
    }
}
