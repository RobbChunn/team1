package Entities;

import java.sql.Timestamp;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data

public class Hashtag {
    @Id
    private String label;
    private Timestamp firstUsed;
    private Timestamp lastUsed;

    @ManyToMany
    @JoinTable
    private List<Tweet> tweets;

}
