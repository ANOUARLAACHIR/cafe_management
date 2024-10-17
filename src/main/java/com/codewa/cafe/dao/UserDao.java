package com.codewa.cafe.dao;

import com.codewa.cafe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
