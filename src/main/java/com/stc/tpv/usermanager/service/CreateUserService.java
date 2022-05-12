package com.stc.tpv.usermanager.service;

import com.stc.tpv.usermanager.controller.CreateUserController;
import com.stc.tpv.usermanager.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * User: job
 * Date: 9/05/22
 * Time: 22:41
 *
 * @author job
 */
@Service
public class CreateUserService {

    private final CreateUserController controller;

    @Autowired
    public CreateUserService(CreateUserController controller){
        this.controller = controller;
    }

    public boolean saveUser(UserDTO user){
       ResponseEntity<Object>  response = controller.savedUser(user);
       return (boolean) response.getBody();
    }
}
