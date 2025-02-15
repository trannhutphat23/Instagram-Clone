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
}
