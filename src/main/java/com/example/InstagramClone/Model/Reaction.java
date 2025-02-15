package com.example.InstagramClone.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "reaction")
public class Reaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(
            name = "user_id",
            foreignKey = @ForeignKey(name = "fk_user_profile_react")
    )
    @JsonBackReference
    private User_Profile userProfile;

    @ManyToOne
    @JoinColumn(
            name = "post_id",
            foreignKey = @ForeignKey(name = "fk_post_react")
    )
    @JsonBackReference
    private Post post;

    public Reaction() {
    }

    public Reaction(User_Profile userProfile, Post post) {
        this.userProfile = userProfile;
        this.post = post;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User_Profile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(User_Profile userProfile) {
        this.userProfile = userProfile;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
