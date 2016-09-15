package githubPractices;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		
		if (str == null || str.length() < 1)
			System.out.println("String is null");
	 
		// trim white spaces
		str = str.trim();
	 
		char flag = '+';
	 
		// check negative or positive
		int i = 0;
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}
		// use double to store result
		double result = 0;
	 
		// calculate value
		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}
	 
		if (flag == '-')
			result = -result;
	 
		// handle max and min
		if (result > Integer.MAX_VALUE)
			System.out.println("Int is above max size");
	 
		if (result < Integer.MIN_VALUE)
			System.out.println("Int is below min size");
		
		System.out.println("Str is " + result);

	}

}
