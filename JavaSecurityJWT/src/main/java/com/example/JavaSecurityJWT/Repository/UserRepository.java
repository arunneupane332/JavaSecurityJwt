package com.example.JavaSecurityJWT.Repository;

import com.example.JavaSecurityJWT.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String username);
}
