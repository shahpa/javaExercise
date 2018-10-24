package githubPractices;

import java.util.HashMap;

public class IsoMorphicString {

	public static void main(String[] args) {
		String str1 = "egg";
		String str2 = "deg";
		
		if(str1 == null || str2 == null)  {
			System.out.println("Null value");
		}
		else if(str1.length() != str2.length())  {
			System.out.println("length is not same");
		}
		else  {
			HashMap<Character, Character> map = new HashMap<Character, Character>();
			for(int i = 0 ; i < str1.length(); i++)  {
				char ch1 = str1.charAt(i);
				char ch2 = str2.charAt(i);
				if(map.containsKey(ch1))  {
					if(!map.get(ch1).equals(ch2))  {
						System.out.println("Strings are not isomorphic");
						break;
					}
					
				}
				else  {
					map.put(ch1, ch2);
				}
				
			}
			
		}
		
	}

}
