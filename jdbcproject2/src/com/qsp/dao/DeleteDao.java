package com.qsp.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.qsp.dto.Pen;
import com.qsp.util.HelperClass;

public class DeleteDao {
	HelperClass helperclass=new HelperClass();
	public void deletePen(Pen pen) {
		String sql="delete from pen where Penid=? ";
		
		
		Connection connection=helperclass.getConnection();
		try {
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setInt(1,2);
	        		
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




