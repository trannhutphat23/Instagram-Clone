package com.example.InstagramClone.Model;

import jakarta.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long image_id;

    private String url;
    private String description;

    @ManyToOne
    @JoinColumn(name="post_id", nullable = false)
    private Post post;

    // Getters and Setters
    public Long getImage_id() {
        return image_id;
    }

    public void setImage_id(Long image_id) {
        this.image_id = image_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
