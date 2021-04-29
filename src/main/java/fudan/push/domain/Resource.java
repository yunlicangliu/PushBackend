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
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long courseId;
    private String key;
    private String description;
    private int type;
    private String content;

    public Resource(Long courseId, String key, String description, int type, String content) {
        this.courseId = courseId;
        this.key = key;
        this.description = description;
        this.type = type;
        this.content = content;
    }
}
