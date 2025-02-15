package com.example.InstagramClone.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

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
}
