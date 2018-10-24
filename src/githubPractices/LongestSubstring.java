package githubPractices;

import java.util.HashSet;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcabcbde";
		System.out.println("Using method 1 -- Longest substring is " + lengthOfLongestSubString(str));
		System.out.println("Using method 2 -- Longest substring is " + lengthOfLongestSubStringUsingSet(str));
	}

	private static int lengthOfLongestSubStringUsingSet(String str) {
		// TODO Auto-generated method stub
		if(str == null)  {
			return 0;
		}
		HashSet<Character> set = new HashSet<Character>();
		
		int max=0;
		 
	    int i=0;
	    int start=0;
	    while(i<str.length()){
	        char c = str.charAt(i);
	        if(!set.contains(c)){
	            set.add(c);
	        }else{
	            max = Math.max(max, set.size());
	 
	            while(start<i&&str.charAt(start)!=c){
	                set.remove(str.charAt(start));
	                start++;
	            }
	            start++;
	        }
	 
	        i++;
	    }
	 
	    max = Math.max(max, set.size());
	 
	    return max;
	}

	private static int lengthOfLongestSubString(String str) {
		// TODO Auto-generated method stub
		if(str == null)  {
			return 0;
		}
		boolean[] flag = new boolean[256];
		
		int result = 0;
		int start = 0;
		char[] arr = str.toCharArray();
		
		for(int i = 0 ; i < arr.length; i++)  {
			char current = arr[i];
			if (flag[current]) {
				result = Math.max(result, i - start);
				// the loop update the new start point
				// and reset flag array
				// for example, abccab, when it comes to 2nd c,
				// it update start from 0 to 3, reset flag for a,b
				for (int k = start; k < i; k++) {
					if (arr[k] == current) {
						start = k + 1; 
						break;
					}
					flag[arr[k]] = false;
				}
			} else {
				flag[current] = true;
			}
		}
		result = Math.max(arr.length - start, result);
		 
		return result;
	}

}
