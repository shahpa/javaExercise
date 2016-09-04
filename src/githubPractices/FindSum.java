package githubPractices;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;


public class FindSum {

	public static void main(String[] args) {
		List<Integer> array1 = Arrays.asList(5,3,4,2,1);
		List<Integer> array2 = Arrays.asList(5,2,4,3,1);
		
		int key = 5;
		
		Collections.sort(array1);
		Collections.sort(array2);
		
		for(int i = 0; i < array1.size()-1; i++)  {
			int value = key-array1.get(i);
			if(array2.contains(value))  {
				System.out.println("The sum will be : " + array1.get(i) + " + " + value + " = " + key);
			}
		}
		

	}

}
