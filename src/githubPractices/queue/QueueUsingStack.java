package githubPractices.queue;

import java.util.Stack;

public class QueueUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * for implementing queue I need different queue method functionality
		 * such as offer(), poll()
		 */
		QueueClass queue = new QueueClass();
		queue.offer(10);
		queue.offer(20);
		queue.offer(15);
		queue.offer(5);
		System.out.println("The element removed from queue is : "+queue.poll());
		System.out.println("The element removed from queue is : "+queue.poll());
		System.out.println("The element removed from queue is : "+queue.poll());
		
	}

}

class QueueClass  {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	public void offer(int i)  {
		stack1.push(i);
		System.out.println(i + " has been added to queue");
	}
	
	public int poll()  {
		while(!stack1.empty())  {
			int i = stack1.pop();
			stack2.push(i);
		}
		int answer = stack2.pop();
		while(!stack2.empty())  {
			int i = stack2.pop();
			stack1.push(i);
		}
		return answer;
	}
}

