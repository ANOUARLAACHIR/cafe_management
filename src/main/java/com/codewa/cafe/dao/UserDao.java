package com.codewa.cafe.dao;

import com.codewa.cafe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, Long> {
    User findByEmail(@Param("email") String email);
}
