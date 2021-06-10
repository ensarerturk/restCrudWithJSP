/*
 * DAO s�n�f�n� olu�turduk.
 * Kullan�c� ayr�nt�lar�n� depolamak i�in bir usersMap kulland�k (sadece DB etkile�imini �nlemek i�in)
 * di�er t�m y�ntemler, kullan�c� ayr�nt�lar�n� okumak, eklemek, g�ncellemek ve silmek i�in bu userMap'i kullan�r.
 * */

package com.kb.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.kb.model.User;

//Just to avoid DB calls in this example, Assume below data is interacting with DB
public class UserDAO {
	static HashMap<String, User> usersMap = new HashMap<String, User>();

	public UserDAO() {
	}

	public List<User> getAllUsers() {

		List<User> userList = new ArrayList<User>(usersMap.values());
		return userList;
	}

	public User getUserForId(String id) {
		User user = usersMap.get(id);
		return user;
	}

	public User createUser(User user) {
		usersMap.put(user.getId(), user);
		return usersMap.get(user.getId());
	}

	public User updateUser(User user) {
		User existingUser= usersMap.get(user.getId());
		if (existingUser != null) {
			existingUser.setName(user.getName());
			existingUser.setEmail(user.getEmail());
			existingUser.setCountry(user.getCountry());
		} else {
			usersMap.put(user.getId(), user);
		}
		return usersMap.get(user.getId());
	}

	public User deleteUser(String id) {
		User userResponse = usersMap.remove(id);
		return userResponse;
	}

}
