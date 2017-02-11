package main.java.serv.Pool;

import java.sql.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;



public class CPool implements ConnectionPool {
		
	List<Connection> availableConnections = new ArrayList<Connection>();
	
	public void CreateConnectionPool() {
		
	  while(!checkIfConnectionPoolIsFull())
			  {
			   availableConnections.add(AddConnection());
			  }
	}

	 private synchronized boolean checkIfConnectionPoolIsFull()
	 {
	  final int MAX_POOL_SIZE = DBConfiguration.getInstance().DB_MAX_CONNECTIONS;

	  if(availableConnections.size() < MAX_POOL_SIZE)
	  {
	   return false;
	  }

	  return true;
	 }
	
	
	
	
	
	public Connection AddConnection() {
		 DBConfiguration config = DBConfiguration.getInstance();
		  try {
		   Class.forName(config.DB_DRIVER);
		   Connection connection = (Connection) DriverManager.getConnection(
		     config.DB_URL, config.DB_USER_NAME, config.DB_PASSWORD);
		   return connection;
		  } catch (ClassNotFoundException e) {
		   e.printStackTrace();
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }
		  return null;

	}

	public Connection GetConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	public void GiveBackConnection(Connection con) {
		// TODO Auto-generated method stub
		
	}

}
