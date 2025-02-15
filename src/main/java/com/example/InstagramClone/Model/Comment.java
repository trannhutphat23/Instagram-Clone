package com.example.InstagramClone.Model;

import jakarta.persistence.*;
import org.apache.catalina.User;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
        name = "user_id",
        referencedColumnName = "id",
        foreignKey = @ForeignKey(name = "fk_user_comment")
    )
    private User_Profile user_profile;
    private String content;
    public Comment() {
    }
    public Comment(User_Profile user_profile, String content) {
        this.user_profile = user_profile;
        this.content = content;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User_Profile getUser_profile() {
        return user_profile;
    }

    public void setUser_profile(User_Profile user_profile) {
        this.user_profile = user_profile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
