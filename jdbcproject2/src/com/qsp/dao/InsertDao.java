package com.qsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.qsp.dto.Pen;
import com.qsp.util.HelperClass;

public class InsertDao {
	HelperClass helperclass=new HelperClass();
	public void insertPen(Pen pen) {
		String sql="insert into pen values(?,?,?,?) ";
		
		
		Connection connection=helperclass.getConnection();
		try {
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setInt(1,pen.getId());
	        preparedstatement.setString(2,pen.getBrand());
			preparedstatement.setString(3,pen.getName());
	        preparedstatement.setLong(4,pen.getPrice());
		    		
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


