package fudan.push.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Mate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mateId;
    private Long courseId;
    private Long requestUserId;
    private Long acceptUserId;
    private Date establishTime;

    public Mate(Long courseId, Long requestUserId, Long acceptUserId, Date establishTime) {
        this.courseId = courseId;
        this.requestUserId = requestUserId;
        this.acceptUserId = acceptUserId;
        this.establishTime = establishTime;
    }
}
