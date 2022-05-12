package com.stc.tpv.loginuser.service;

import com.stc.tpv.loginuser.model.LoginRequest;
import com.stc.tpv.loginuser.model.LoginResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * User: job
 * Date: 7/05/22
 * Time: 21:31
 *
 * @author job
 */
@Service
@Slf4j
public class LoginService {

    public LoginResponse login(LoginRequest request){
        log.info("request: "+request.toString());
        // validaciones
        //

        return  new LoginResponse();
    }
}
