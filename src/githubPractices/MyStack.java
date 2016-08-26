package githubPractices;

public class MyStack {

	private int maxLength;
	private String myArray[];
	private int tos;
	
	MyStack(int s)  {
		maxLength = s;
		myArray = new String[maxLength];
		tos = 0;
		
	}

	public String pop() {
		if(tos >= 0)  {
			tos--;
			String str = myArray[tos];
			
			return str;
		}
		else  {
			System.out.println("Stack is empty");
			return null;
		}
	}

	public void push(String string) {
		if(tos < maxLength)  {
			myArray[tos] = string;
			tos++;
		}
		else  {
			System.out.println("Stack is full");
		}
		
	}
}
