package com.chandra.springstart.springproject_1.propertyplaceholder;

public class MyDao {

	private String dbServer;

	MyDao(String dbServer)
	{
		this.dbServer=dbServer;
	}

	@Override
	public String toString() {
		return "MyDao [dbServer=" + dbServer + "]";
	}

}
