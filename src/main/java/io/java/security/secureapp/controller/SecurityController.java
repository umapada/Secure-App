package io.java.security.secureapp.controller;

import io.java.security.secureapp.model.AuthenticationRequest;
import io.java.security.secureapp.model.AuthenticationResponse;
import io.java.security.secureapp.service.JwtUtil;
import io.java.security.secureapp.service.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Umapada Manna
 * Date: 11/Sep/2022
 */

@RestController
@RequestMapping("/security")
public class SecurityController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailService userDetailService;

    @Autowired
    private JwtUtil jwtTokenUtil;

    /**
     * createAuthenticationToken method will create the authentication token
     * @param authenticationRequest
     * @return
     * @throws Exception
     */
    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUserNAme(), authenticationRequest.getPassword()));
        }catch(BadCredentialsException e){
            throw new Exception("Incorrect username and password");
        }
        final UserDetails userDetails = userDetailService.loadUserByUsername(authenticationRequest.getUserNAme());
        final String jwt = jwtTokenUtil.generateToken(userDetails);
        return ResponseEntity.ok(new AuthenticationResponse((jwt)));
    }
}
