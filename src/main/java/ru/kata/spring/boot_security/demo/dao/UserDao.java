package ru.kata.spring.boot_security.demo.dao;





import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    User getUserById(int id);
    User getUserByName(String name);

    void addUser(User user);

    User updateUser(int id, User updatedUser);

    void deleteUser(int id);

    void deleteAll();
}