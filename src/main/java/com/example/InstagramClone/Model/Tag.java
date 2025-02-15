package com.example.InstagramClone.Model;

import jakarta.persistence.*;
import org.apache.catalina.User;

@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tag_id;

    @ManyToOne
    @JoinColumn(name="post_id", nullable = false)
    private Post post;

    private User user;
}
