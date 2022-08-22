package com.qa.atos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDqueries {

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;


public CRUDqueries() {
		try {
			conn = DriverManager.getConnection(DBconfig.URL, DBconfig.USER, DBconfig.PASS);
			this.stmt = conn.createStatement();
			System.out.println("Connection Successful!");
		} catch (SQLException e) {
			System.out.println("Incorrect credentials");
			e.printStackTrace();
		}
	}

public void create(String Firstname, String Secondname, int PhoneNumber, String Address) {

String createStmt = "INSERT INTO person(Firstname, Secondname, PhoneNumber, Address) VALUES('" + Firstname + "','" + Secondname
				+ "'," + PhoneNumber + ",'" + Address + "');";
		try {
			stmt.executeUpdate(createStmt);
			System.out.println("Create statement executed");
		} catch (SQLException e) {
			System.out.println("Bad query");
			e.printStackTrace();
		}
	}

	public void read() {
		String readStmt = "SELECT * FROM person;";
		try {
			rs = stmt.executeQuery(readStmt);
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id"));
				System.out.println("Firstname: " + rs.getString("Firstname"));
				System.out.println("Secondname: " + rs.getString("Secondname"));
				System.out.println("PhoneNumber: " + rs.getInt("PhoneNumber"));
				System.out.println("Address: " + rs.getString("Address"));
			}

		} catch (SQLException e) {
			System.out.println("Bad query");
			e.printStackTrace();
		}
	}

	public void readyByID(int id)	{
		String readstatement = "SELECT * FROM person WHERE id = "+ id + ";";
		try {
			stmt.executeQuery(readstatement);
		} catch (SQLException e) {
			System.out.println("Bad Query");
			e.printStackTrace();
		}
	}
	public void update(int id, String updateAddress) {
		String updateStmt = "UPDATE person SET Address = '" + updateAddress + "' WHERE id = " + id + ";";
		try {
			stmt.executeUpdate(updateStmt);
			System.out.println("Update statement executed");
			
		}catch (SQLException e) {
			System.out.println("Bad query");
			e.printStackTrace();
		}

	}
	public void delete(int id) {
		String delStmt = "DELETE FROM person WHERE id=" + id + ";";
		try {
			stmt.executeUpdate(delStmt);
			System.out.println("Delete statement executed");
		} catch (SQLException e) {
			System.out.println("Bad query");
			e.printStackTrace();
		}

	}
	public void closeConn() {
		try {
			conn.close();
			System.out.println("Closed!");
		} catch (SQLException e) {
			System.out.println("Closing connection...");
			e.printStackTrace();
		}
	}

}
