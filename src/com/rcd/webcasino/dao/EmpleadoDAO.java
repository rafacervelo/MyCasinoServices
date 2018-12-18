package com.rcd.webcasino.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rcd.webcasino.exceptions.DataException;
import com.rcd.webcasino.model.User;

public class EmpleadoDAO {
	
	
	
	public User findById(Integer id)
			throws Exception {
		
		User u = null;
				
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionManager.getConnection();

			String sql;
			sql =  "SELECT FIRST_NAME, LAST_NAME, MANAGER_ID "
				  +"FROM EMPLOYEES "
				  +"WHERE EMPLOYEE_ID = ? ";
			
			// Preparar a query
			System.out.println("Creating statement...");
			preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			// Establece os parámetros
			int i = 1;
			preparedStatement.setString(i++, "%" + name);
			preparedStatement.setString(i++, "%" + surname1.toUpperCase);
			
			resultSet = preparedStatement.executeQuery(sql);			
			//STEP 5: Extract data from result set			

			String name = null;
			String surname1 = null;
			String username = null;
			String userid = null;
			
			if (resultSet.next()) {
				i = 1;
				name = resultSet.getString(i++);
				surname1 = resultSet.getString(i++);
				username = resultSet.getString(i++); 
				userid = resultSet.getString(i++);
				
				
				u = new User();
				u.setUserid(userid);
				u.setName(name);
				u.setSurname1(surname1);
				u.setUsername(username);
								
				System.out.println("Cargado "+u);
			} else {
				throw new Exception("Non se encontrou o usuario "+userid);
			}
			if (resultSet.next()) {
				throw new Exception("Usuario "+userid+" duplicado");
			}
						
		} catch (SQLException ex) {
			throw new DataException(ex);
		} finally {            
			JDBCUtils.closeResultSet(resultSet);
			JDBCUtils.closeStatement(preparedStatement);
			JDBCUtils.closeConnection(connection);
		}  	
			
		return u;
	}
	
	

	public List<User> findByNombre(String name, String surname1)
			throws Exception {	
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try{
			
			connection = ConnectionManager.getConnection();

			String sql;
			sql =    " SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, MANAGER_ID " 
					+" FROM EMPLOYEES "
					+" WHERE "
					+"	UPPER(FIRST_NAME) LIKE '%?%'" 
					+"    and"
					+"    UPPER(LAST_NAME) LIKE '%?%'";
			
			// Preparar a query
			System.out.println("Creating statement...");
			preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			// Establece os parámetros
			int i = 1;
			preparedStatement.setString(i++, name);
			preparedStatement.setString(i++, surname1);
			
			resultSet = preparedStatement.executeQuery(sql);			
			//STEP 5: Extract data from result set
			
			String userid = null;
			String name = null;
			String surname1 = null;
			String username = null;
			
			List<User> users = new ArrayList<User>();
			User u = null;
			while (resultSet.next()) {
				i = 1;
				userid = resultSet.getString(i++);
				name = resultSet.getString(i++);
				surname1 = resultSet.getString(i++);
				username = resultSet.getString(i++); 

				u = new User();
				u.setUserid(userid);
				u.setName(name);
				u.setSurname1(surname1);
				u.setUsername(username);
								
				users.add(u);
			} 
			return users;
		} catch (SQLException ex) {
			throw new DataException(ex);
		} finally {            
			JDBCUtils.closeResultSet(resultSet);
			JDBCUtils.closeStatement(preparedStatement);
			JDBCUtils.closeConnection(connection);
		}  	
	}
	
	public User[] findByUsername(String username)
			throws Exception {
		return null;
	}
	
	public User create(User u)
			throws Exception {
		return null;
	}
	
	public boolean update(User u)
			throws Exception {
		return false;
	}
	
	public void delete(User u)
			throws Exception {
		
	}
		
}
