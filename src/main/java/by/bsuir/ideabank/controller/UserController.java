package by.bsuir.ideabank.controller;

import by.bsuir.ideabank.converter.RequestConverter;
import by.bsuir.ideabank.converter.UserConverter;
import by.bsuir.ideabank.dto.RequestDTO;
import by.bsuir.ideabank.dto.UserDTO;
import by.bsuir.ideabank.entity.Request;
import by.bsuir.ideabank.service.RequestService;
import by.bsuir.ideabank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserConverter userConverter;
    @Autowired
    private RequestService requestService;
    @Autowired
    private RequestConverter requestConverter;

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(userConverter.convertToDTO(
                userService.createUser(userConverter.convertToEntity(userDTO))));
    }

    @GetMapping("/{userId}/requests")
    public ResponseEntity<List<RequestDTO>> getRequests(@PathVariable Long userId) {
        return ResponseEntity.ok(requestConverter.convertToDTOList(requestService.getRequestsByUserId(userId)));
    }

    @PostMapping("/{userId}/requests")
    public ResponseEntity<RequestDTO> createRequest(@RequestBody RequestDTO requestDTO, @PathVariable Long userId) {
        requestDTO.getUser().setId(userId);
        Request createdRequest = requestService.createRequest(requestConverter.convertToEntity(requestDTO));
        return ResponseEntity.ok(requestConverter.convertToDTO(createdRequest));
    }
}
