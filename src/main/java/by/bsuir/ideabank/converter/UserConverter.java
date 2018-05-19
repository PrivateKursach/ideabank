package by.bsuir.ideabank.converter;

import by.bsuir.ideabank.dto.UserDTO;
import by.bsuir.ideabank.entity.User;

public interface UserConverter {
    UserDTO convertToDTO(User user);
    User convertToEntity(UserDTO userDTO);
}
