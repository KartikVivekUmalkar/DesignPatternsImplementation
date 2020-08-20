package com.singletondesignpattern;

public class Singleton {

	// Private static instance of the Singleton Class
	// For avoiding overhead of synchronized, we can perform eager loading, i,e creating a new instance while declaration itself.
	private static Singleton instance; 
	

	private Singleton() {

	}

	// For multi-threading support make the getInstance method synchronized. 
	
	public static Singleton getInstance() {

		if (instance == null) {
			return instance = new Singleton();
		} else {
			return instance;
		}
	}

}
