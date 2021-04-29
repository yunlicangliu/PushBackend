package push.domain.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HelloRequest {
    private String name;
    private String hello;
}
