package com.simple.StringArray;

public class StringArrayList {
	
	private static StringArrayList instance = null;
	
	//Private constructor
	private StringArrayList() {
		
	}
	
	public static StringArrayList getInstance() {
		if(instance == null) {
			instance = new StringArrayList();
		}
		return instance;
	}
	
	//Method to find the minimum string-String Array list
	public String findMinString(String[] array) {
		if(array==null||array.length == 0) {
			return null;
		}
		String min = array[0];
		for (int i =1; i < array.length; i++) {
			if(array[i].compareTo(min)<0) {
				min = array[i];
			}
		}
		return min;
	}
	
	public class Main{
		public static void main(String[] args) {
			//Create an array of strings
			String[]strings = {"Orange", "Apple", "Banana", "Cat", "Dog"};
			
			//Get the instance
			StringArrayList stringarraylist = StringArrayList.getInstance();
			
			//Find alphabetically minimum string
			String minString = stringarraylist.findMinString(strings);
			
			//Printing the results
			System.out.println("Alphabetically Minimum String:"+ minString);
			
		}
	}
}
