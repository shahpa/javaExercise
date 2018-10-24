/*package githubPractices;

import java.util.ArrayList;
import java.util.List;

*//**
 * 
 * @author Parth_Shah
 *
 * Producer - consumer example
 * 
 * 
 *//*



public class VeritasQuestion {

	List<Integer> resourceList = new ArrayList<Integer>();
	int capacity = 10;
	int counter = 0;
	
	public void consume()  {
		if(ressourceList.size() == 0)  {
			System.out.println("empty");
			return ;
		}
		System.out.println("resource used : " + resourceList.get(0));
		resourceList.remove(0);
	}
	public void produce(int i)  {
		if(resourceList.size() >= capacity)  {
			System.out.println("queue is full, consume ");
			return ;
		}
		resourceList.add(i);
		counter ++;
	}
	
	
	public static void main(String args[])  {
		int n = Math.random();
		Thread t1 = new Thread(new Runnable()  {
			void run()  {
				try  {
					produce(n);
				}
				catch (InterruptedException ex)  {
					System.out.println(ex.getmessage());
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable()  {
			void run()  {
				try  {
					consume();
				}
				catch(InterruptedException ex)  {
					System.out.println(ex.getmessage());
				}
			}
		});
		
		t1.start();
		
		t2.start();
		
		
		
	}
	
	String s1 = "for";
	fun(Strinng s1)  {
		String str = "I am parth. I am here for interview. FORE";
		Char[] c = str.toCharArray();
		Char[] c2 = s1.toCharArray();
		int wordCount = 0;
int j = 0;
int counter = c2.size;
		for(int i = 0; i< c.size; i++)  {
			if(c[i] == c2[j])  {
				counter--;
				j++;
			}
			if(counter == 0)  {
				wordCount ++;
				counter = c2.size;
				j=0;
			}
		}
		System.out.println("Total number of occurances of word is : " +wordCount);
	}
	
	
}
*/