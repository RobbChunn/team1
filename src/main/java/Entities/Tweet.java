package Entities;

import java.sql.Timestamp;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data

public class Tweet {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinTable
    private User author;

    private Timestamp posted;
    private Boolean deleted;
    private String content;

    @OneToMany
    private Tweet inReplyTo;
    // same table, just like in Users
    @ManyToOne
    private List<Tweet> replies;

    @OneToMany
    private Tweet repostOf;
    @ManyToOne
    private List<Tweet> reposts;

    @ManyToMany
    @JoinTable
    private List<User> likes;

    @ManyToMany
    @JoinTable
    private List<Hashtag> hashtags;

    @ManyToMany
    @JoinTable
    private List<User> usersMentioned;


}
