package com.example.InstagramClone.Seeder;

import com.example.InstagramClone.Model.User_Profile;
import com.example.InstagramClone.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataSeeder implements CommandLineRunner {
    private final UserRepository userRepository;

    public DataSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        User_Profile user = new User_Profile();
        System.out.println(user);
        user.setUserName("JohnDoe");
        user.setPhone("123456789");
        user.setGmail("john@example.com");
        user.setRole("USER");

        userRepository.save(user);

        System.out.println("✅ Dữ liệu đã được đẩy vào database thành công!");
    }

}
