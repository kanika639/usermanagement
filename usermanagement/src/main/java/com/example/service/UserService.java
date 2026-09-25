package com.example.usermanagement.service;
import com.example.usermanagement.model.User;
import com.example.usermanagement.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService {
    private final UserRepository repository;
    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    public List<User> getAllUsers() {
        return repository.findAll();
    }
    public User getUser(Long id) {
        return repository.findById(id).orElse(null);
    }
    public User saveUser(User user) {
        return repository.save(user);
    }
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}