package fudan.push.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseId;

    private Long authorId;
    private int status; // TODO: 改成boolean
    private String name;
    private String description;
    private int level;
    private int heat;
    // TODO: Image
    private int category;

    public Course(Long authorId, int status, String name, String description, int level, int heat, int category) {
        this.authorId = authorId;
        this.status = status;
        this.name = name;
        this.description = description;
        this.level = level;
        this.heat = heat;
        this.category = category;
    }
}
