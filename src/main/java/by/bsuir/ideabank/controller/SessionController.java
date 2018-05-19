package by.bsuir.ideabank.controller;

import by.bsuir.ideabank.converter.UserConverter;
import by.bsuir.ideabank.dto.UserDTO;
import by.bsuir.ideabank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/sessions")
public class SessionController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserConverter userConverter;

    @PostMapping
    public ResponseEntity<UserDTO> createSession(@RequestBody UserDTO loginDTO) {
        return ResponseEntity.ok(userConverter.convertToDTO(userService.login(loginDTO.getEmail(), loginDTO.getPassword())));
    }
}
