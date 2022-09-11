package io.java.security.secureapp.model;

import lombok.Getter;

/**
 * Author: Umapada Manna
 * Date: 11/Sep/2022
 */

@Getter
public class AuthenticationResponse {

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }
}
