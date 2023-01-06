package mapper;

import model.User;
import model.UserEntity;

import javax.inject.Singleton;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Singleton
public class UserEntityMapper {
    public UserEntity toEntity(User user) {
        return new UserEntity(user.id(), user.username());
    }

    public User toBo(UserEntity userEntity) {
        return new User(userEntity.id, userEntity.getUsername());
    }

    public List<UserEntity> toEntity(List<User> users) {
        return users.stream().map(this::toEntity).collect(toList());
    }

    public List<User> toBo(List<UserEntity> userEntity) {
        return userEntity.stream().map(this::toBo).collect(toList());
    }
}
