package emlakburada.client;

import emlakburada.dto.request.UserRequest;
import emlakburada.dto.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "emlakburada-4",url="http://localhost:8080")
public interface UserClient {

    @PostMapping(value = "/users")
    UserResponse saveUser(UserRequest request);

    @GetMapping(value = "/users")
    List<UserResponse> getAllUser();

    @GetMapping(value = "/users/{id}")
    UserResponse getUserById(@PathVariable int id);

}
