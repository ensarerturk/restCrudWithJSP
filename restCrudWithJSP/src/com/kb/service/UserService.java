/*
 * business service classýný yarattýk.
 * getAllUsers() – Bu yöntem tüm kullanýcýlarý almak için kullanýlýr , GET isteðinin sunulmasýna yardýmcý olur

  * getUserForId(String id) – Bu yöntem, belirli bir kullanýcý için kullanýcý ayrýntýlarýný almak için kullanýlýr, belirli bir kullanýcý için 
  * GET isteðinin sunulmasýna yardýmcý olur

  * createUser(User user) – Bu yöntem, yeni kullanýcý ayrýntýlarýný eklemek için kullanýlýr , POST isteðinin sunulmasýna yardýmcý olur

  * updateUser(User user) – Bu yöntem, kullanýcý ayrýntýlarýný güncellemek için kullanýlýr , PUT isteðinin sunulmasýna yardýmcý olur

  * deleteUser(String id) – Bu yöntem, kullanýcý ayrýntýlarýný silmek için kullanýlýr , DELETE isteðinin sunulmasýna yardýmcý olur
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
