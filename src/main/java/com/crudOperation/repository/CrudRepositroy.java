package com.crudOperation.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.crudOperation.entity.User;


public interface CrudRepositroy extends JpaRepository<User, Integer> {



}
