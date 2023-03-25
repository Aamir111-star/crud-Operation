package com.crudOperation.service;

import java.util.List;

import com.crudOperation.entity.User;

public interface MyService {
public void saveData(User user);
public List<User> fetchdata();
public void Delete(Integer id);
}
