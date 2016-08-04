package com.designPatterns.beahvioral.visitor;

import com.designPatterns.core.item.Book;
import com.designPatterns.core.item.Fruit;
import com.designPatterns.core.item.ItemElement;
import com.designPatterns.core.item.ShoppingCartVisitor;
import com.designPatterns.core.item.ShoppingCartVisitorImpl;

/*
 * Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects. 
 * With the help of visitor pattern, we can move the operational logic from the objects to another class.
 */
public class ShoppingCartVisitorDemo {

	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] { new Book(20, "1234"),
				new Book(100, "5678"), new Fruit(10, 2, "Banana"),
				new Fruit(5, 5, "Apple") };

		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			
			/*
			 * The drawback of visitor pattern is that we should know the return type of visit() methods 
			 * at the time of designing otherwise we will have to change the interface and all of its implementations. 
			 * 
			 * Another drawback is that if there are too many implementations of visitor interface, it makes it hard to extend.
			 */
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
}
