package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.domain.Role;
import ru.kata.spring.boot_security.demo.domain.User;

import java.util.List;

public class HardcodeDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        switch (username){
            case "admin":
                return new User(List.of(
                        new Role("admin"),
                        new Role("user")
                ),
                        "admin",
                        "admin"
                );
            case "user":
                return new User(List.of(
                        new Role("user")
                ),
                        "user",
                        "user"
                );
            default: throw new IllegalArgumentException("Unknown username");
        }
    }
}
