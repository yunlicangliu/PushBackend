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
public class MateSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long mateId;
    private Date date;
    private String content;
    private float progress;
    private int status; // TODO: 改成boolean

    public MateSchedule(Long mateId, Date date, String content, float progress, int status) {
        this.mateId = mateId;
        this.date = date;
        this.content = content;
        this.progress = progress;
        this.status = status;
    }
}
