package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement; 

public class MysqlCon {

	
    
 
    public String getSize(double gurt){  
	    try{  
		    Class.forName("com.mysql.jdbc.Driver");  
		    Connection con=DriverManager.getConnection("jdbc:mysql://parcel-db:3306/parcel?serverTimezone=UTC","parcel","parcelpassword");   
		    Statement stmt=con.createStatement();  
		    ResultSet rs=stmt.executeQuery("select distinct size from sizes where min <= " + gurt +" and max >= " + gurt );  
		    rs.next();
		    String size =rs.getString(1);  
		    con.close();  
		    return size;
	    }catch(Exception e){ System.out.println(e);} 
	    	return "";
    }  
  
}
