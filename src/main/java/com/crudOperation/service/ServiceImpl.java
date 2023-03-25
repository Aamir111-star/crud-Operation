package com.crudOperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudOperation.entity.User;
import com.crudOperation.repository.CrudRepositroy;
@Service
public class ServiceImpl implements MyService {
@Autowired
private CrudRepositroy repo;

				@Override
				public void saveData(User user) {
					repo.save(user);
				}
		@Override
		public List<User> fetchdata() {
		List<User> user = repo.findAll();
			return user;
		}
		@Override
		public void Delete(Integer id) {		
			repo.deleteById(id);
		}

}
