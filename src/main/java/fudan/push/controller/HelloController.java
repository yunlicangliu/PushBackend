package fudan.push.controller;

import fudan.push.request.HelloRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

public class HelloController {


    @GetMapping("/hello")
    public String sayHello() {
        return "hello world";
    }

    @PostMapping("/post")
    public ResponseEntity<?> sayPost(@RequestBody HelloRequest helloRequest) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", helloRequest.getName());
        map.put("hello", helloRequest.getHello());
        return ResponseEntity.ok(map);
    }
}
