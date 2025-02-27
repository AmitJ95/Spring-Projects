package com.learning.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class SquareCalculator2 {

	//private ExecutorService executor = Executors.newSingleThreadExecutor();
	private ExecutorService executor = Executors.newFixedThreadPool(2);
	

	public Future<Integer> calculate(Integer input){
		return executor.submit(()-> {
			Thread.sleep(1000);
			return input*input;
		});
	};
	
	
	
	public static void main(String[] args) {
		Future<Integer> future1 = new SquareCalculator2().calculate(10);
		Future<Integer> future2 = new SquareCalculator2().calculate(100);
		{
		
		while(!(future1.isDone() && future2.isDone())){
			System.out.println(
				String.format("future1 is %s and future2 is %s",
						future1.isDone()? "done":"not done",
						future2.isDone()? "done":"not done")	
					
					);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		try {
			System.out.println(" "+future1.get());
			System.out.println(" "+future2.get());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

}
