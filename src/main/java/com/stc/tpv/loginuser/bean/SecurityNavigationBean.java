package com.stc.tpv.loginuser.bean;

import com.stc.tpv.loginuser.model.LoginRequest;
import com.stc.tpv.loginuser.service.LoginService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.zkoss.bind.annotation.Command;

/**
 * User: job
 * Date: 7/05/22
 * Time: 08:34
 *
 * @author job
 */
@Slf4j
@Data
public class SecurityNavigationBean {
    private LoginRequest loginRequest;
//    private final LoginService service;

//    @Autowired
    public SecurityNavigationBean( ){
//        this.service = service;
        loginRequest = new LoginRequest();
    }

    @Command
    public void  login(){
        log.info("Clic en login******** "+loginRequest.toString());
//        this.service.login(loginRequest);
    }

}