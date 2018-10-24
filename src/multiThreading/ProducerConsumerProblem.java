package multiThreading;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerProblem {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		
		Pc pc = new Pc();
		Thread t1 = new Thread(new Runnable() {
			public void run()  {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run()  {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}

}

class Pc  {
	int value = 0;
	int capacity = 2;
	LinkedList<Integer>list = new LinkedList<Integer>();
	public void produce() throws InterruptedException {
		
		synchronized(this)  {
			while(true)  {
				while(list.size() == capacity)  {
					wait();
				}
				
				System.out.println("Producer produced  - " + value);
				list.add(value);
				value++;
				notify();
				
				Thread.sleep(1000);
				
			}
		}
	}
	
	public void consume() throws InterruptedException {
		synchronized(this)  {
			while(true)  {
				while(list.size() == 0)  {
					wait();
				}
				int val = list.removeFirst();
				System.out.println("Consumer is consuming - " + val);
				notify();
				Thread.sleep(1000);
			}
		}
	}
}
