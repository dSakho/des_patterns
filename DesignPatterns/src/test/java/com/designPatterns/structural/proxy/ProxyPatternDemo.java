package com.designPatterns.structural.proxy;

import com.designPatterns.core.image.Image;
import com.designPatterns.core.image.ProxyImage;

/*
 * Provide a surrogate or placeholder for another object to control access to it.
 * 
 * Add a wrapper and delegation to protect the real component from undue complexity.
 * 
 * In proxy pattern, a class represents functionality of another class. 
 * 
 * We create object having original object to interface its functionality to outer world. * 
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println("");

		// image will not be loaded from disk
		image.display();
	}
}
