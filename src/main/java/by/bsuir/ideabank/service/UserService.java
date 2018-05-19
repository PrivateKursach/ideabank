package by.bsuir.ideabank.service;

import by.bsuir.ideabank.entity.User;

public interface UserService {
    User login(String email, String password);
    User createUser(User user);
}
