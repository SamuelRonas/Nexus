package com.nexus.backend.interfaces;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nexus.backend.user.User;

@Repository
public interface UserRepository  extends CrudRepository<User, Integer>{
    Optional<User> findByEmail(String email);
}
