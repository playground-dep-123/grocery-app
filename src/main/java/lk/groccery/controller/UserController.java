package lk.groccery.controller;

import lk.groccery.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping()
    public List<User> getAllUsers() {
        return null;
    }

    @PostMapping()
    public User createUser(@RequestBody User user){
        return null;
    }

    @GetMapping("/id")
    public User getUserById(@PathVariable Long id){
        return null;
    }

    @PutMapping("/{id}")
    public User getUpateById(@PathVariable Long id,@RequestBody User user){
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){

    }
}
