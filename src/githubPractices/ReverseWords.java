package githubPractices;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "my name is parth";
		String[] result = str.split(" ");
		String ans = "";
		for(int i = result.length-1; i>=0; i--)  {
			ans = ans + " " + result[i];
		}
		System.out.println(ans);
	}

}
