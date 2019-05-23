package com.example.security.config;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

import java.util.Arrays;
import java.util.Collection;

@Configuration
public class ProjectConfiguration extends WebSecurityConfigurerAdapter {

    //hasul este one way nu poti decripta

    public PasswordEncoder passwordEncoder(){
        BCryptPasswordEncoder

        return NoOpPasswordEncoder.getInstance();


    }



    //USERDETAILS  interfata ce reprezinta user
    //UserDetailService face managementul userilor
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetailsManager us = new InMemoryUserDetailsManager();
        //solid principles !!!!

        UserDetails user = User.withUsername("bill")
                    .password("12345")
                    .authorities("ADMIN")
                    .build();
        UserDetails user2 = User.withUsername("John")
                    .password("12345")
                    .authorities("MANAGER")
                    .build();

        us.createUser(user);
        us.createUser(user2);
        return us;
        //Contracte:
        //USER DETAILS descriem userul
        //UserDetalisService sa incarcam userul
        //GrantedAutority care ne spune daca e admin .. etc
    }



    @Override
    protected void configure(HttpSecurity http) throws Exception{

        http.httpBasic();
        http.authorizeRequests().antMatchers("/hello").access("hasAuthority('Admin')")
                .anyRequest().permitAll();

    }

}
