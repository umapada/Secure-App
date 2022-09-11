package io.java.security.secureapp.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Author: Umapada Manna
 * Date: 11/Sep/2022
 */

@Service
public class MyUserDetailService implements UserDetailsService {
    /**
     * This is for test only, take proper security measure to store user/password
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("umapada","manna", new ArrayList<>());
    }
}
