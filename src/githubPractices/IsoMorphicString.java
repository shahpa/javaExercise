package githubPractices;

import java.util.Hashtable;

public class IsoMorphicString {

	public static void main(String[] args) {
		String str1 = "egg";
		String str2 = "dog and and";
		char[] charStr1 = str1.toCharArray();
		char[] charStr2 = str2.toCharArray();
		Hashtable<Character, Character> table = new Hashtable<Character, Character>();
		if(str1.length() == str2.length())  {
			for (int i =0; i<str1.length(); i++)  {
				if(table.containsKey(charStr1[i]))  {
					if(table.get(charStr1[i]) == charStr2[i])  {
						System.out.println("String is not isomorphic");
						break;
					}
				}
				else  {
					if(table.containsValue(charStr1[i]))  {
						System.out.println("String is not isomorphic");
						break;
					}
					table.put(charStr1[i], charStr2[i]);
				}
			}
			System.out.println("String is isomorphic");
		}

	}

}
