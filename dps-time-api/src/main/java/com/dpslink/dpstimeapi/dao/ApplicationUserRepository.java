package com.dpslink.dpstimeapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpslink.dpstimeapi.models.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
