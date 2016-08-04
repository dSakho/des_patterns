package com.designPatterns.creational.singleton;

import com.desginPatterns.core.shapes.Singleton;

public class SingletonTest {
	
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		assert s1.equals(s2);
	}
}
