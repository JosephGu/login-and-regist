package com.example.demo.authentication;

import com.example.demo.appuser.AppUser;
import com.example.demo.appuser.AppUserRole;
import com.example.demo.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthenticationService {

    @Autowired
    private AppUserService appUserService;

    public boolean authenticate(AuthenticationRequest request){
        AppUser newUser =  new AppUser("","",request.getEmail(),request.getPassword(), AppUserRole.USER);
        String verify = appUserService.verifyUserAuthentication(newUser);
        return verify == "Authenticated";
    }

}
