package githubPractices;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args)  {
		String str1 = "cinema";
		String str2 = "iceman";
		String tmp = sort(str1);
		String tmp2 = sort(str2);
		if(tmp.equals(tmp2))  {
			System.out.println("It is anagram String");
		}
		
		String replaceSpace = "My name is Parth";
		replaceSpace = replaceSpace.replace(" ", "%20");
		System.out.println("The replaced string is : " + replaceSpace);
	}
	private static String sort(String str1)  {
		String result;
		char[] tmpChar = str1.toCharArray();
		Arrays.sort(tmpChar);
		result = new String(tmpChar);
		return result;
	}
}
