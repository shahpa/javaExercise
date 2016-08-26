package githubPractices;

public class PolishNotation {

	public static void main(String[] args) {
		String[] tokens = new String[] {"2", "1", "+", "3", "*"};
		MyStack s = new MyStack(tokens.length);
		
		for (int i = 0; i<tokens.length; i++)  {
			switch(tokens[i])  {
			case "/" :
				String tmp1 = "("+s.pop()+"/"+s.pop()+")";
				System.out.println(tmp1);
				s.push(tmp1);
				break;
				
			case "*" :
				String tmp2 = "("+s.pop()+"*"+s.pop()+")";
				System.out.println(tmp2);
				s.push(tmp2);
				break;
			
			case "+" :
				String tmp3 = "("+s.pop()+"+"+s.pop()+")" ;
				System.out.println(tmp3);
				s.push(tmp3);
				break;
				
			case "-" :
				String tmp4 = "("+s.pop()+"-"+s.pop()+")" ;
				System.out.println(tmp4);
				s.push(tmp4);
				break;
				
			default :
				s.push(tokens[i]);
				System.out.println("token : " + tokens[i] + " pushed");
				break;
			}
		}
		
		

	}

}
