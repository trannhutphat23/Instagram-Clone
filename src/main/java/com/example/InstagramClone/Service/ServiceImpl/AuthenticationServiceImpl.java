package com.example.InstagramClone.Service.ServiceImpl;

import com.example.InstagramClone.DTO.UserDto;
import com.example.InstagramClone.Mapper.UserMapper;
import com.example.InstagramClone.Model.User_Profile;
import com.example.InstagramClone.Repository.UserRepository;
import com.example.InstagramClone.Service.AuthenticationService;
import com.example.InstagramClone.Utils.ApiKeyAuthFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Autowired
    private ApiKeyAuthFilter apiKeyAuthFilter;
    @Autowired
    private UserRepository userRepository;
    public Object signup(UserDto userDto) {
        User_Profile userProfile = UserMapper.toUser(userDto);

        if (userProfile.getUserName() == null || userProfile.getPhone() == null || userProfile.getGmail() == null) {
            return "There missing some variables";
        }

        // solve role

        //

        userRepository.save(userProfile);
        return userProfile;
    }
}
