package com.example.InstagramClone.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
        name = "user_id",
        referencedColumnName = "user_id",
        foreignKey = @ForeignKey(name = "fk_user_comment")
    )
    private User_Profile userProfile;
    private String content;
    public Comment() {
    }
    public Comment(User_Profile userProfile, String content) {
        this.userProfile = userProfile;
        this.content = content;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User_Profile getUser_profile() {
        return userProfile;
    }

    public void setUser_profile(User_Profile userProfile) {
        this.userProfile = userProfile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
