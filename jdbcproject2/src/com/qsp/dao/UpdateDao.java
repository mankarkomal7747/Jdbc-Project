package com.qsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.qsp.dto.Pen;
import com.qsp.util.HelperClass;

public class UpdateDao {
	HelperClass helperclass=new HelperClass();
	public void updatePen(Pen pen) {
		String sql="update pen set PenBrand=?,PenName=?,PenPrice=? where Penid=? ";
		
		
		Connection connection=helperclass.getConnection();
		try {
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setInt(4,pen.getId());
	        preparedstatement.setString(1,pen.getBrand());
			preparedstatement.setString(2,pen.getName());
	        preparedstatement.setLong(3,pen.getPrice());
	        		
		    preparedstatement.execute();
	       System.out.println("All Good");
			
			if (connection!=null) {
				connection .close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}






