package by.bsuir.ideabank.service.impl;

import by.bsuir.ideabank.dao.UserDAO;
import by.bsuir.ideabank.entity.User;
import by.bsuir.ideabank.exception.AuthorizationException;
import by.bsuir.ideabank.exception.ServiceValidationException;
import by.bsuir.ideabank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User login(String email, String password) {
        User user = userDAO.getUserByEmail(email);
        if (user == null) {
            throw new AuthorizationException();
        }
        if (!user.getPassword().equals(password)) {
            throw new AuthorizationException();
        }
        return user;
    }

    @Override
    public User createUser(User user) {
        if (userDAO.getUserByEmail(user.getEmail()) != null) {
            throw new ServiceValidationException();
        }
        user.setRole(1);
        return userDAO.createUser(user);
    }
}
