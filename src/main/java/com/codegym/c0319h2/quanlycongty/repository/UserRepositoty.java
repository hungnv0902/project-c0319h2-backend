package com.codegym.c0319h2.quanlycongty.repository;

import com.codegym.c0319h2.quanlycongty.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoty extends JpaRepository<User,Long> {
    User findByUserName(String userName);
    Boolean existsByUserName(String userName);
    Boolean existsByEmail(String email);
}
