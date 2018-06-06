package frontend.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hello-remote", url = "http://localhost:9000", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/api")
    String printDate(@RequestParam(name = "username", required = false) String username);

}
