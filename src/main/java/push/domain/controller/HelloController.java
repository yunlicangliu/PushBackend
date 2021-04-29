package push.domain.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import push.domain.request.HelloRequest;

import java.util.HashMap;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello world";
    }

    @PostMapping("/post")
    public ResponseEntity<?> sayPost(@RequestBody HelloRequest helloRequest){
        HashMap<String, String> map = new HashMap<>();
        map.put("name", helloRequest.getName());
        map.put("hello",helloRequest.getHello());
        return ResponseEntity.ok(map);
    }

}
