package com.singletondesignpattern;

public class Singleton {

	private static Singleton instance; // Private static instance of the Singleton Class

	private Singleton() {

	}

	public static Singleton getInstance() {

		if (instance == null) {
			return instance = new Singleton();
		} else {
			return instance;
		}
	}

}
