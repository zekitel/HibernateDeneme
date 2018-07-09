package com.zeki.HibernateDeneme.resource;

import com.zeki.HibernateDeneme.repository.UserRepository;
import com.zeki.HibernateDeneme.model.Users;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource  {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/all")
    public Collection<Users> getAll(){
        
        return userRepository.findAll();
    }


}
