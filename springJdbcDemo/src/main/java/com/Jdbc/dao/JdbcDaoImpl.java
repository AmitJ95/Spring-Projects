package com.Jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.Jdbc.demo.model.UserDetails;
//@Configuration
//@ConfigurationProperties("application.properties")
public class JdbcDaoImpl {

	@Value("${spring.datasource.url}")
	private String url;
	public UserDetails getUserDetails(int userid){


		//Connection con = null;
		//String url = "jdbc:postgresql://localhost:5432/hibernatedb";
		String userName = "postgres";
		String password = "password";

		try(Connection con = DriverManager.getConnection(url, userName, password);
				PreparedStatement ps = 
						con.prepareStatement("select * from userdetails where userid=?");) {

			ps.setInt(1, userid);
			UserDetails userdetails = null ;

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				userdetails = new UserDetails(userid, rs.getString("username"));
			}

			ps.close();
			return userdetails;

		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}


	} 





}
