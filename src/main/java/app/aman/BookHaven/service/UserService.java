package app.aman.BookHaven.service;

import app.aman.BookHaven.dto.ProfileUpdateRequestDto;
import app.aman.BookHaven.dto.UserDto;
import app.aman.BookHaven.entity.User;

public interface UserService {
    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
