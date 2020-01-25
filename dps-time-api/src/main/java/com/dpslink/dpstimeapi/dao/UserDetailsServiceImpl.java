package com.dpslink.dpstimeapi.dao;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dpslink.dpstimeapi.models.ApplicationUser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private ApplicationUserRepository applicationUserRepository;

    public UserDetailsServiceImpl(ApplicationUserRepository applicationUserRepository) {
        this.applicationUserRepository = applicationUserRepository;
    }
    
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ApplicationUser applicationUser = applicationUserRepository.findByUsername(username);
        if (applicationUser == null) {
            throw new UsernameNotFoundException(username);
        }
        
        if (!applicationUser.isActive()) {
        	log.warn(applicationUser.getUsername() + " has a status of " + applicationUser.isActive());
        }
 
        //return new User(applicationUser.getUsername(), applicationUser.getPassword(), emptyList());
        return new User(applicationUser.getUsername(), applicationUser.getPassword(), applicationUser.isActive(), true, true, true, emptyList());
    }
}
