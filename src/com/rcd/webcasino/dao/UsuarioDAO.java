package com.rcd.webcasino.dao;

import java.util.List;

import com.rcd.webcasino.model.User;

public interface UsuarioDAO {
	
	public User findById(String id)
		throws Exception;
	
	public List<User> findByNombre (String name, String surname1)
		throws Exception;
	
	public User findByUsername(String username)
		throws Exception;
	
	public User create (User u)
		throws Exception;
	
}