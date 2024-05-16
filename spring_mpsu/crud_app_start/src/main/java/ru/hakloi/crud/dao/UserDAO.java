package ru.hakloi.crud.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ru.hakloi.crud.models.User;

@Component
public class UserDAO {
    private List<User> users;
    private static int COUNT;
    
    // init constructor 
    {
        users = new ArrayList<>();
        users.add(new User(++COUNT, "Luka"));
        users.add(new User(++COUNT, "Clown2000"));
        users.add(new User(++COUNT, "jiji"));
    }

    public List<User> index(){
        return users;
    }

    public User show(int id){
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}
