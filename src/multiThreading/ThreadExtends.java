package multiThreading;

public class ThreadExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runner runner1 = new Runner();
		Runner runner2 = new Runner();
		
		runner1.start();
		runner2.start();
	}

}

class Runner extends Thread  {
	public void run()  {
		for(int i = 0 ; i < 10 ; i ++)  {
			System.out.println("Thread: " + i);
			
			try  {
			Thread.sleep(1000);
			}
			catch(InterruptedException e)  {
				System.out.println("Exception occured : " + e.getMessage());
			}
		}
	}
}
