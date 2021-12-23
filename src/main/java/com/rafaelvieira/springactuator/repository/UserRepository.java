package com.rafaelvieira.springactuator.repository;


import com.rafaelvieira.springactuator.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    long countByActive(boolean active);

}
