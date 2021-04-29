package fudan.push.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String wechatId;
    private String username;
    private int userType;

    public User(String wechatId, String username, int userType) {
        this.wechatId = wechatId;
        this.username = username;
        this.userType = userType;
    }
}
