package com.designPatterns.structural.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;

/*
 * Attach additional responsibilities to an object dynamically. 
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 * 
 * Client-specified embellishment of a core object by recursively wrapping it.
 * 
 * Wrapping a gift, putting it in a box, and wrapping the box.
 */
public class DecoratorExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// First open an inputstream of it:
		FileInputStream fis = new FileInputStream("/objects.gz");
	
		// We want speeeed, so let's buffer it in memory:
		BufferedInputStream bis = new BufferedInputStream(fis);
	
		// The file is gzipped, so we need to ungzip it:
		GZIPInputStream gis = new GZIPInputStream(bis);
	
		// We need to unserialize those Java objects:
		ObjectInputStream ois = new ObjectInputStream(gis);
	
		// Now we can finally use it:
		Object someObject = (Object) ois.readObject();
	}
}
