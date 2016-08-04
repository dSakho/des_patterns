package com.designPatterns.core.item;

public interface ShoppingCartVisitor {

	int visit(Book book);

	int visit(Fruit fruit);
}
