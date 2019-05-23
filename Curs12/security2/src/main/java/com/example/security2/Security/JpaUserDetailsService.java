package com.example.security2.Security;

import com.example.security2.model.User;
import com.example.security2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class JpaUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User u =  userRepository.findUserByUsername(username);

        if(u == null) throw new UsernameNotFoundException("User has not been found");
        return new JpaUserDetails(u);
    }
}
