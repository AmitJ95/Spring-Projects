/*In call by value a copy of variables is passed into another method
so even if in method variables are assigned new values , the values 
of original variables will not change*/
package com.learning.java;
public class CallByValAndCallByRef{

	int p;
	int q;
    public int add(int c, int d){
      c = 30;
      d = 40;
      return c+d;
    }


    public static void main(String[] args) {
       int x = 10;
       int y = 20;
       System.out.println("Value of x: "+x+" "+"Value of y: "+y);
       CallByValAndCallByRef obj = new CallByValAndCallByRef();
       obj.add(x, y);
       System.out.println("Value of x after : "+x+" "+"Value of y after: "+y);
       
       
       obj.p = 50;
       obj.q = 60;
       System.out.println("Value of p: "+obj.p+" "+"Value of q: "+obj.q);
       obj.swap(obj);
       System.out.println("Value of p after : "+obj.p+" "
       +"Value of q after: "+obj.q);
    }
    
    public void swap(CallByValAndCallByRef t) {
    	
    	int temp;
    	temp = t.p; //temp = 50
    	t.p = t.q; // t.p = 60
    	t.q = temp; // t.q = 50
    	
    	
    }
    
    
} 