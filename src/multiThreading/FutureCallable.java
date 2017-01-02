package multiThreading;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCallable {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		Future<Integer> future = executor.submit(new Callable<Integer>()  {

			@Override
			public Integer call() throws Exception {
				Random random = new Random();
				int duration = random.nextInt(4000);
				System.out.println("Starting....");
				
				Thread.sleep(duration);
				if(duration > 2000)  {
					throw new IOException("Thread is sleeping too long...!!");
				}
				
				System.out.println("Ending....");
				return duration;
			}
			
		});
		
		executor.shutdown();
		
		try {
			System.out.println("Total time is " + future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println(e.getMessage());
			IOException ex = (IOException)e.getCause();
			System.out.println(ex.getMessage());
		}

	}

}
