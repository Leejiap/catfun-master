package com.cf.catfun.persional.dao.interfaces;

import com.cf.catfun.common.pojo.User;

/**
 * 
 * @author ljp
 *
 */
public interface IUserDao {
	
	public User getByPhoneNumber(int phoneNumber);
	
	public Integer register(User user);

}
