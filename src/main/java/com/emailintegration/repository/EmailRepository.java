package com.emailintegration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emailintegration.entity.Email;

public interface EmailRepository extends JpaRepository<Email, Long>{

}
