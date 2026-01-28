package mehesantti.backendproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String get(){
        return "Hello World";
    }

    @PostMapping("/post")
    public String post(@RequestBody String data){
        return "Hello from post " + data ;
    }
}
