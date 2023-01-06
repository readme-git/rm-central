package repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import model.UserEntity;

import javax.inject.Singleton;
import java.util.Optional;

@Singleton
public class UserRepository implements PanacheRepository<UserEntity> {

    public Optional<UserEntity> findByUsername(String username) {
        return find("username", username).stream().findFirst();
    }
}
