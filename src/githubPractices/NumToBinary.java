package githubPractices;

public class NumToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Convert number into binary format with 4 digits
		 * 0000
		 * 0001
		 * 0010
		 */
		
		int i = 0; 
		while (true)  {
			if(i>15)  {
				System.out.println("Number is out of range");
				break;
			}
			System.out.println("The binary of i = " +i+ " is : "+calculateBinary(i));
			i++;
		}
	}

	private static String calculateBinary(int i) {
		// TODO Auto-generated method stub
		String answer="";
		for(int j = 0; j<4 ; j++)  {
			int mod = i%2;
			if(mod == 0)  {
				answer = "0" + answer;
			}
			else  {
				answer = "1" + answer;
			}
			i=i/2;
		}
		return answer;
	}

}
