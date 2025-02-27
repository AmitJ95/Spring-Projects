package com.learning.asyncp;

interface OnGeekEventListener {
	// this can be any type of method
	void onGeekEvent();	
	
}

public class B {

	private OnGeekEventListener mListener; 
	
	public void registerOnGeekEventListener(OnGeekEventListener mListener) {
		this.mListener = mListener;
	}
	//async task
	public void doGeekStuff() {
		
		//An async task always executes in new thread
		
		new Thread(new Runnable() {
			public void run() {
				 // perform any operation
                System.out.println("Performing operation in Asynchronous Task");
                
             // invoke the callback method of class A
                if(mListener != null) {
                	mListener.onGeekEvent();
                }
			}
		}).start();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B obj = new B();
        OnGeekEventListener mListener = new A(); 
        obj.registerOnGeekEventListener(mListener);
        obj.doGeekStuff();
        
	}
	
	

}

class A implements OnGeekEventListener{

	@Override
	public void onGeekEvent() {
		// TODO Auto-generated method stub
		System.out.println("Performing callback after Asynchronous Task");
		
	}
	
}
