package com.zeki.HibernateDeneme.resource;

import com.zeki.HibernateDeneme.repository.UserRepository;
import com.zeki.HibernateDeneme.model.Users;
import org.apache.catalina.User;
import org.json.JSONArray;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/users")
public class UsersResource  {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/all")
    public Collection<Users> getAll(){
        
        return userRepository.findAll();
    }

    @GetMapping(value ="/getById")
    public Users getUserById(@RequestParam int id ){
        return userRepository.getOne();

    }

    @PostMapping("/insert")
    public void insertUser(Users users){
        this.userRepository.save(users);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam int id){
        this.userRepository.deleteById(id);
    }
    @PostMapping("update")
    public void updateUser(Users users){
        this.userRepository.deleteById(users.getId());
        this.userRepository.save(users);

    }



}
