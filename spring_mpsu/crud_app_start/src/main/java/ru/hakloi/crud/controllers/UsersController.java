package ru.hakloi.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.hakloi.crud.dao.UserDAO;

@Controller
@RequestMapping("/users") // all adresses strat with this 
public class UsersController {
    
    private final UserDAO userDAO;
    @Autowired
    public UsersController(UserDAO userDAO){
        this.userDAO = userDAO;
    }
    

    @GetMapping() // address is empty 'cause /people is already exists
    public String index(Model model){
        // get list of people from DAO -> view
        model.addAttribute("users", userDAO.index());
        return "/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
        // get one person by id from DAO -> view
        model.addAttribute("user", userDAO.show(id));
        return "/show";
    }
}
