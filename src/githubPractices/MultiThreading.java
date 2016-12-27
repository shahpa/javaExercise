package githubPractices;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MultiThreading {

	
	public void testThread()
	{

	   //create a callable for each method
	   Callable<Void> callable1 = new Callable<Void>()
	   {
	      @Override
	      public Void call() throws Exception
	      {
	         method1();
	         return null;
	      }
	   };

	   Callable<Void> callable2 = new Callable<Void>()
	   {
	      @Override
	      public Void call() throws Exception
	      {
	         method2();
	         return null;
	      }
	   };


	   //add to a list
	   List<Callable<Void>> taskList = new ArrayList<Callable<Void>>();
	   taskList.add(callable1);
	   taskList.add(callable2);

	   //create a pool executor with 3 threads
	   ExecutorService executor = Executors.newFixedThreadPool(2);

	   try
	   {
	      //start the threads
	      List<Future<Void>> futureList = executor.invokeAll(taskList);

	      for(Future<Void> voidFuture : futureList)
	      {
	         try
	         {
	            //check the status of each future.  get will block until the task
	            //completes or the time expires
	            voidFuture.get(100, TimeUnit.MILLISECONDS);
	         }
	         catch (ExecutionException e)
	         {
	            System.err.println("Error executing task " + e.getMessage());
	         }
	         catch (TimeoutException e)
	         {
	            System.err.println("Timed out executing task" + e.getMessage());
	         }

	      }


	   }
	   catch (InterruptedException ie)
	   {
	      //do something if you care about interruption;
		   System.err.println("Timed out executing task" + ie.getMessage());
	   }

	}

	private void method1() throws InterruptedException
	{
		Thread.sleep(10000);
	   System.out.println("method1");
	}

	private void method2() throws InterruptedException
	{
		//Thread.sleep(10000);
	   System.out.println("method2");
	}

	
	
}
