package mapper;

import dto.UserDto;
import model.User;

import javax.inject.Singleton;

@Singleton
public class UserDtoMapper {

    public UserDto toDto(User user) {
        return new UserDto(user.id(), user.username());
    }

    public User toBo(UserDto userDto) {
        return new User(userDto.getUsername());
    }
}
