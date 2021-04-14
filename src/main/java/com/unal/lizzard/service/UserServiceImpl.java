package com.unal.lizzard.service;

import com.unal.lizzard.model.Role;
import com.unal.lizzard.model.User;
import com.unal.lizzard.repository.UserRepository;
import com.unal.lizzard.web.dto.UserRegistrationDto;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(), registrationDto.getlastName(), registrationDto.getEmail(),
                registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}