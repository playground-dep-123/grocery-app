package lk.groccery.service;

import lk.groccery.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    User updateUser(Long id,User user);
    void deleteUser(Long id);

}
