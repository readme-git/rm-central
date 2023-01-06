package service;

import mapper.UserEntityMapper;
import model.User;
import model.UserEntity;
import repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class UserService {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    @Inject
    public UserService(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    public User findByUsername(String username) {
        UserEntity userEntity = userRepository.findByUsername(username).orElseThrow();
        return userEntityMapper.toBo(userEntity);
    }
}
