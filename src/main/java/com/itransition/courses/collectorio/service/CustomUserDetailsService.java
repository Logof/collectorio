package com.itransition.courses.collectorio.service;

import com.itransition.courses.collectorio.CustomUserDetails;
import com.itransition.courses.collectorio.entity.User;
import com.itransition.courses.collectorio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEmail(email);
        user.orElseThrow(() -> new UsernameNotFoundException("Cannot find the User with email: " + email));
        return user.map(CustomUserDetails::new).get();
    }
}
