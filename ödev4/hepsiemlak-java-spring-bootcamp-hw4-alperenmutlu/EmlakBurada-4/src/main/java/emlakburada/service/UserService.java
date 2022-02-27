package emlakburada.service;

import emlakburada.model.User;
import emlakburada.model.dto.reponse.UserResponse;
import emlakburada.model.dto.request.UserRequest;
import emlakburada.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService extends UserBaseService {

    @Autowired
    private UserRepository userRepository;

    public List<UserResponse> getAllUser(){
        List<User> users = userRepository.findAll();
        return users.stream().map(user -> convertToUserResponse(user)).collect(Collectors.toList());
    }

    public void saveUser(UserRequest userRequest){
        userRepository.save(convertToUserEntity(userRequest));
    }

}
