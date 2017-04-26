package githubPractices;

import java.util.ArrayList;
import java.util.List;

public class FindXX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str = "abcxxabc";
		//String str = "xcxx";
		String str = "zzzzx";
		System.out.println(doubleX(str));
		
		
		List<String> numbers = new ArrayList<String>();
		for(int i = 0 ; i< 100; i++)  {
			numbers.add(String.valueOf(i));
		}
		for(int i = 0 ; i< numbers.size(); i++)  {
			System.out.println(numbers.get(i));
		}
		
		
		
	}
	static boolean doubleX(String str) {
		int index = str.indexOf('x');
		if( index+1 <= str.length()-1 && str.charAt(index + 1)=='x')  {
			return true;
		}
		  /*for(int i =0 ; i<str.length()-1; i++)  {
		      if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x')  {
		        return true;
		      } 
		  }*/
		  return false;
		}
}

