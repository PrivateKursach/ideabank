package by.bsuir.ideabank.dao;

import by.bsuir.ideabank.entity.User;

public interface UserDAO {
    User getUserByEmail(String email);
    User createUser(User user);
}
