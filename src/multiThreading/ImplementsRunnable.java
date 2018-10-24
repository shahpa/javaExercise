package multiThreading;

public class ImplementsRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Thread t1 = new Thread(new RunnerImplements());
		Thread t2 = new Thread(new RunnerImplements());
		
		t1.start();
		t2.start();*/
		
		Thread t1 = new Thread(new Runnable()  {
			public void run() {
				for(int i = 0 ; i < 10 ; i++)  {
					System.out.println("Thread : " + i);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		t1.start();
		
	}

}

class RunnerImplements implements Runnable {


	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 10 ; i++)  {
			System.out.println("Thread : " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}