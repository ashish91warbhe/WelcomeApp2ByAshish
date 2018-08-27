package com.sathya.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private JdbcTemplate jt;
	public boolean check(String s1, String s2) {
		
		int x=jt.queryForObject("select count(*) from login where uname=? and  pwd=?",Integer.class,s1,s2);
		if(x==1)
			return true;
		else
			return false;
		
		
	}

}
