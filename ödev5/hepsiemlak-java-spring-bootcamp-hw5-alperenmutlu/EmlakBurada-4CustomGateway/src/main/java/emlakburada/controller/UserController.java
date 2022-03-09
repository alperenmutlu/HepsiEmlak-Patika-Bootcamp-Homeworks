package emlakburada.controller;


import emlakburada.client.UserClient;
import emlakburada.dto.request.UserRequest;
import emlakburada.dto.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping(value = "/users")
    public List<UserResponse> findAllUser() {
        return userClient.getAllUser();
    }

    @PostMapping(value = "/users")
    public UserResponse saveUser(@RequestBody UserRequest request) {
        return userClient.saveUser(request);
    }


    @GetMapping(value = "/users/{id}")
    public UserResponse findByUserId(@PathVariable int id) {
        return userClient.getUserById(id);
    }

}


