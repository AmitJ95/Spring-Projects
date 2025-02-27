package com.Jdbc.demo.model;

public class SkepticRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Item itemA = new Item(10);
    Item itemB = new Item(10);
    
    Object itemC = itemA;
    
    System.out.println("|"+itemA.equals(itemB) + "|"+itemC.equals(itemB)+"|");
	}

}
