package com.syskan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.syskan.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    public User findByUserNameAndPassword(String userName, String password);
}
