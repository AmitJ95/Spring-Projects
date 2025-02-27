package com.learn.java;

@FunctionalInterface
public interface A {
	
  public void methodOne();
  
  
  default void m1() {
	  System.out.println();
  }
  
  public static void m2() {
	  System.out.println("static method");
   }
}
