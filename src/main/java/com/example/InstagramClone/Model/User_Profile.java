package com.example.InstagramClone.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user_profile")
public class User_Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String user_name;
    private Date created_date;
    private String phone;
    private String gmail;
    @OneToMany(mappedBy = "userProfile")
    private List<Reaction> reactions;
    @OneToOne(mappedBy = "user_profile")
    private Comment comment;
    public void setUserName(String name) {
        this.user_name = name;
    }
    public String getUser_name(){
        return this.user_name;
    }

}
