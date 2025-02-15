package com.example.InstagramClone.Repository;

import com.example.InstagramClone.Model.User_Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User_Profile, Long> {

}
