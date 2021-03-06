package com.rafaelvieira.springactuator.controller;


import com.rafaelvieira.springactuator.dto.UserDTO;
import com.rafaelvieira.springactuator.dto.mapper.UserMapper;
import com.rafaelvieira.springactuator.entity.User;
import com.rafaelvieira.springactuator.repository.UserRepository;
import com.rafaelvieira.springactuator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    private UserRepository userRepository;

    //Construtor cheio
    @Autowired
    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable String id) {
        return this.userRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public User save(@Valid @RequestBody UserDTO userDTO) {
        return this.userRepository.save(UserMapper.fromDTO(userDTO));
    }

    @PutMapping("/{id}")
    public User update(@PathVariable String id, @Valid @RequestBody UserDTO userDTO) {
        return this.userService.update(id, UserMapper.fromDTO(userDTO));
    }

    @GetMapping("/{id}/state")
    public void changeState(@PathVariable String id) {
        this.userService.changeState(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable String id) {
        this.userService.deleteById(id);
    }

}
