package com.Jdbc.demo.model;

final class Item {

	Integer size;
	Item(Integer size){
		this.size=size;
	}
	
	
	public boolean equals(Item item2) {
		// TODO Auto-generated method stub
		if(this==item2) return true;
		return this.size.equals(item2.size);
	}
}
