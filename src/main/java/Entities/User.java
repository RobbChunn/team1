package Entities;

import java.sql.Timestamp;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Embeddable
public class User {

    @Embedded
    private String credentials;
    //private or pub??
    @Embedded
    private String Profile;

    @Id
    private String username;
    private String password;
    private Timestamp joined;
    private Boolean deleted;
    private String firstName;
    private String secondName;
    private String email;
    private String phone;

    @OneToMany
    //add cascade like from the API assignment
    private List<Tweet> tweets;

    @ManyToOne
    @JoinTable
    private List<Tweet> likedTweets;

    @ManyToMany
    private List<User> followers;
    //check if this is redundant or if there is a better
    //way to write this out
    @ManyToMany
    private List<User> following;

    @ManyToMany
    private List<Tweet> mentions;


}
