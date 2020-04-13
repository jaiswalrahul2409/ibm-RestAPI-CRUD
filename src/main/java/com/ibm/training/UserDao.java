package com.ibm.training;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	User u;
	@Autowired
	JdbcTemplate template;

	Integer getCountOfUsers() {
		return template.queryForObject("select count(*) from wallet", Integer.class);
	}

	User getUserById(String id) {
		return template.queryForObject("select * from wallet where Account_Id = ?", new Object[] { id },
				new BeanPropertyRowMapper<User>(User.class));
	}

	List<User> ListOfUsers() {
		return template.query("select * from wallet", new BeanPropertyRowMapper<User>(User.class));
	}

	String createAccount(User user) {
		String sql = "INSERT INTO wallet values (?,?,?,?)";
		template.update(sql, user.Account_Id, user.Account_Name, user.Account_Balance, user.pin);
		return "Success!";
	}

	String deleteAccount(String accountId) {
		String sql = "delete from wallet where Account_Id = ?";
		template.update(sql, accountId);
		return "Deleted!";
	}

	public String updateAccount(User user, String id) {
		String sql = "update wallet set Account_Balance = ? where Account_Id = ?";
		template.update(sql, user.getAccount_Balance(), id);
		return "Updated!";
	}

	public List<Map<String, Object>> getAllUserForReal() {
		String sql = "select * from wallet";
		List<Map<String, Object>> list = template.queryForList(sql);
		return list;
	}
}
