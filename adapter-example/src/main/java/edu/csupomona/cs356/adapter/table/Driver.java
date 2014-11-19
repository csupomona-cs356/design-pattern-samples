package edu.csupomona.cs356.adapter.table;

public class Driver {

	public static void main(String[] args) {
		BigStringTable table = new BigStringTableImpl();
		String key = table.put("ThisIsOurLastClassOnPatterns");

		System.out.println("Key is: " + key);
		System.out.println("Getting the value from table: " + table.get(key));
	}

}
