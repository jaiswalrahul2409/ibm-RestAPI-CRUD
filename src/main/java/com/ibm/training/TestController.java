package com.ibm.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	TestService service;

	@RequestMapping("/count")
	Integer getCountOfUsers() {
		return service.getCountOfUsers();
	}

	@RequestMapping("/users/id/{id}")
	User getUserById(@PathVariable String id) {
		return service.getUserById(id);
	}

	@RequestMapping("/allUsers")
	List<User> ListOfUsers() {
		return service.ListOfUsers();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/users/create")
	String createAccount1(@RequestBody User user) {

		System.out.println(
				"hi" + user.getAccount_Id() + user.getAccount_Name() + user.getAccount_Balance() + user.getPin());
		return service.createAccount1(user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/users/delete/{id}")
	String deleteAccount1(@PathVariable String id) {
		return service.deleteAccount1((String) id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/users/update/{id}")
	String updateAccount(@RequestBody User user, @PathVariable String id) {
		return service.updateAccount(user, (String) id);
	}

}
