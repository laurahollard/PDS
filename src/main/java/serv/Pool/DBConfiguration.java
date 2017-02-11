package main.java.serv.Pool;



public class DBConfiguration {
	public String DB_USER_NAME ;
	  
	 public String DB_PASSWORD ;
	  
	 public String DB_URL;
	  
	 public String DB_DRIVER;
	  
	 public Integer DB_MAX_CONNECTIONS;
	  
	 public DBConfiguration(){
		 DB_USER_NAME = "root";
		  DB_PASSWORD = "root";
		  DB_URL = "jdbc:mysql://localhost:1521/marouane";
		  DB_DRIVER = "com.mysql.jdbc.Driver";
		  DB_MAX_CONNECTIONS = 20;
	 }
	  
	 private static DBConfiguration configuration = new DBConfiguration();
	  
	 public static DBConfiguration getInstance(){ 
	  return configuration;
	 }
	  

}
