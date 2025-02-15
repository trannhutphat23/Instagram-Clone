package com.example.InstagramClone.Seeder;

import com.example.InstagramClone.Model.User_Profile;
import com.example.InstagramClone.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {
    private final UserRepository userRepository;
//    private final PostRepository postRepository;
//    private final ImageRepository imageRepository;

    public DataSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
//        this.postRepository = postRepository;
//        this.imageRepository = imageRepository;
    }

    @Override
    public void run(String... args) {
        User_Profile user = new User_Profile();
        System.out.println(user);
        user.setUserName("JohnDoe");
//        user.setPhone("123456789");
//        user.setGmail("john@example.com");
//        user.setRole("USER");


//        Post post = new Post();
//        post.setTitle("My First Post");
//        post.setContent("This is my first post on Instagram Clone!");
//        post.setUser(user);
//
//        // Tạo Image
//        Image image1 = new Image();
//        image1.setUrl("https://example.com/image1.jpg");
//        image1.setDescription("First Image");
//        image1.setPost(post);
//
//        Image image2 = new Image();
//        image2.setUrl("https://example.com/image2.jpg");
//        image2.setDescription("Second Image");
//        image2.setPost(post);
//
//        post.setImageList(List.of(image1, image2));
//
//        user.setPosts(List.of(post));

        userRepository.save(user);

        System.out.println("✅ Dữ liệu đã được đẩy vào database thành công!");
    }

}
