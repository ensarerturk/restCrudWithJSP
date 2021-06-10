/*
 * business service class�n� yaratt�k.
 * getAllUsers() � Bu y�ntem t�m kullan�c�lar� almak i�in kullan�l�r , GET iste�inin sunulmas�na yard�mc� olur

  * getUserForId(String id) � Bu y�ntem, belirli bir kullan�c� i�in kullan�c� ayr�nt�lar�n� almak i�in kullan�l�r, belirli bir kullan�c� i�in 
  * GET iste�inin sunulmas�na yard�mc� olur

  * createUser(User user) � Bu y�ntem, yeni kullan�c� ayr�nt�lar�n� eklemek i�in kullan�l�r , POST iste�inin sunulmas�na yard�mc� olur

  * updateUser(User user) � Bu y�ntem, kullan�c� ayr�nt�lar�n� g�ncellemek i�in kullan�l�r , PUT iste�inin sunulmas�na yard�mc� olur

  * deleteUser(String id) � Bu y�ntem, kullan�c� ayr�nt�lar�n� silmek i�in kullan�l�r , DELETE iste�inin sunulmas�na yard�mc� olur
 * */

package com.kb.service;

import java.util.List;

import com.kb.dao.UserDAO;
import com.kb.model.User;

public class UserService {
	UserDAO userDao = new UserDAO();

	public List<User> getAllUsers() {
		List<User> userList = userDao.getAllUsers();
		return userList;
	}

	public User getUserForId(String id) {
		User user = userDao.getUserForId(id);
		return user;
	}

	public User createUser(User user) {
		User userResponse = userDao.createUser(user);
		return userResponse;
	}

	public User updateUser(User user) {
		User userResponse = userDao.updateUser(user);
		return userResponse;
	}

	public User deleteUser(String id) {
		User userResponse = userDao.deleteUser(id);
		return userResponse;
	}

}
