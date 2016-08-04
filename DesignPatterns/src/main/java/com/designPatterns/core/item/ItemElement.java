package com.designPatterns.core.item;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
