package com.revature.SpringDataJPA.repository;

import com.revature.SpringDataJPA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByName(String name);
}
