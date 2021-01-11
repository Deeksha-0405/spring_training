package com.zensar;

import java.sql.*;

import com.zensar.Utility.DBUtility;

public class BabyRepository {
	
	public boolean CheckLogin(String username, String password) {
		
		Connection con=DBUtility.getConnection();
		String sql="select * from admin where username=?";
		
		try {
			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, username);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				String pass=rs.getString("password");
				if (password.equals(pass)) {
					return true;
				}
				else {
					System.out.println("Wrong login");
				}
			}
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}
		return false;
	}

}
