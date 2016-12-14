package githubPractices;

import java.util.Hashtable;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World !");
		
		//bubble sort example
				/*int[] inputArray = {10, 9, 8, 7, 6, 5};
				BubbleSort bubbleSortObj = new BubbleSort();
				bubbleSortObj.doBubbleSort(inputArray);*/
				
				/*int result = wordpattern("abb", null);
				System.out.println(result);
				*/
				MultiThreading mt = new MultiThreading();
				mt.testThread();
				
	//testing			
	}
	
	static int wordpattern(String pattern, String input) {
        Hashtable<Character, String> dict = new Hashtable<Character, String>();
        dict.put('a', "red");
        dict.put('b', "blue");
        
        String result = "";
        
        if(pattern == null)  {
            return 0;
        }
        if(input == null)  {
            return 0;
        }
        for(int i=0; i< pattern.length(); i++)  {
            if(dict.containsKey(pattern.charAt(i)))  {
                result = result + dict.get(pattern.charAt(i));
            }
        }
        if(input.equals(result))  {
            return 1;
        }
        else  {
            return 0;
        }

    }

}
