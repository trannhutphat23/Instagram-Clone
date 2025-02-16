package com.example.InstagramClone.Mapper;

import com.example.InstagramClone.DTO.UserDto;
import com.example.InstagramClone.Model.User_Profile;

public class UserMapper {
    static public User_Profile toUser(UserDto userDto){
        User_Profile userProfile = new User_Profile();

        userProfile.setUserName(userDto.username());
        userProfile.setPhone(userDto.phone());
        userProfile.setGmail(userDto.gmail());

        return userProfile;
    }
}
