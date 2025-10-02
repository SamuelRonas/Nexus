package com.nexus.backend.user.interfaces;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nexus.backend.user.domain.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{
    Optional<User> findByEmail(String email);
}
