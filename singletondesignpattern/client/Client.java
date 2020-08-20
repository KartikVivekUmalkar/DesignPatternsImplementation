package com.singletondesignpattern.client;

import com.singletondesignpattern.Singleton;

public class Client {

	public static void main(String[] args) {

		Singleton instance1 = Singleton.getInstance();

		Singleton instance2 = Singleton.getInstance();

		System.out.println("HashCode of instance1 is: -"+instance1.hashCode());
		System.out.println("HashCode of instance2 is: -"+instance2.hashCode());
		
		System.out.println("Both HashCode are equal which suggests one and only one instance of the class is created");

	}

}
