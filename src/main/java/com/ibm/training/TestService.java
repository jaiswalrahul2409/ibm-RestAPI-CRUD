package com.ibm.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Autowired
	UserDao dao;

	Integer getCountOfUsers() {
		return dao.getCountOfUsers();
	}

	User getUserById(String id) {
		return dao.getUserById(id);
	}

	List<User> ListOfUsers() {
		return dao.ListOfUsers();
	}

	String createAccount1(User usr) {
		return dao.createAccount(usr);
	}

	String deleteAccount1(String accountId) {
		return dao.deleteAccount(accountId);
	}

	public String updateAccount(User usr, String id) {
		return dao.updateAccount(usr, id);
	}

}
