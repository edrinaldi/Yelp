package it.polito.tdp.Yelp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class DBConnect {

	static private HikariDataSource ds = null;
	static private String url = "jdbc:mysql://localhost:3306/yelp";

	public static Connection getConnection() {

		if (ds == null) { // Pattern singleton - un'unica data source
			// crea nuova data source
			ds = new HikariDataSource();	// crea un pool di connessione
			ds.setJdbcUrl(url);
			ds.setUsername("root");
			ds.setPassword("Jimmyboston00!");
		}

		try {
			return ds.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}

	}
}
