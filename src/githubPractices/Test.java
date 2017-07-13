package githubPractices;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "1.0";
		String s2 = "1.0.1";
		
		System.out.println(compare(s1, s2));
	}

	public static int compare(String s1, String s2)  {
		return s1.compareTo(s2);
	}
}
