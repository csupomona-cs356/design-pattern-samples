package edu.csupomona.cs356.adapter.table;

public interface BigStringTable {

	/** Put a String value into the table, and get the key to retrieve it. */
	public String put(String value);

	/** Use the key to retrieve the String value from the table. */
	public String get(String key);
}
