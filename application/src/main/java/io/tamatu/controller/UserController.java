package io.tamatu.controller;

import io.tamatu.data.UserDto;
import io.tamatu.ports.api.UserServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServicePort userServicePort;

    @PostMapping
    public UserDto addUser(@RequestBody UserDto userDto){
        return this.userServicePort.addUser(userDto);
    }

    @PutMapping
    public UserDto updateUser(@RequestBody UserDto userDto){
        return  this.userServicePort.updateUser(userDto);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        this.userServicePort.deleteUser(id);
    }

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable Long id){
        return this.userServicePort.getUser(id);
    }

    @GetMapping
    public List<UserDto> getUsers(){
        return this.userServicePort.getUsers();
    }
}
