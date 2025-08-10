package com.example.userservice.controller;

import com.example.userservice.model.User;
import com.example.userservice.service.UserService;
import com.example.userservice.dto.NotificationDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final RestTemplate restTemplate;

    // Notification service URL
    private static final String NOTIFICATION_SERVICE_URL = "http://localhost:8081/notify";

    public UserController(UserService userService) {
        this.userService = userService;
        this.restTemplate = new RestTemplate();
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        notifyChange(createdUser, "Created");
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        notifyChange(updatedUser, "Updated");
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        notifyChange(new User(){{
            setUsername("ID:"+id);
        }

		public void setUsername(String string) {
			// TODO Auto-generated method stub
			
		}}, "Deleted");
        return ResponseEntity.noContent().build();
    }

    private void notifyChange(User user, String action) {
        NotificationDTO dto = new NotificationDTO(user, action);
        restTemplate.postForEntity(NOTIFICATION_SERVICE_URL, dto, Void.class);
    }
}
