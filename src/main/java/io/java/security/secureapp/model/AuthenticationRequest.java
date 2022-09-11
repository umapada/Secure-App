package io.java.security.secureapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Author: Umapada Manna
 * Date: 11/Sep/2022
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationRequest {
    private String userNAme;
    private String password;

}
