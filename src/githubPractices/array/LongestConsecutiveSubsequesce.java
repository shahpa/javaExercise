package githubPractices.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequesce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {30,2,4,6,8,10,1,3,5,7,9,20};
		System.out.println(longestConsecutive(num));
		
	}

	public static int longestConsecutive(int[] num) {
		// if array is empty, return 0
		if (num.length == 0) {
			return 0;
		}
	 
		Set<Integer> set = new HashSet<Integer>();
		int max = 1;
	 
		for (int e : num)
			set.add(e);
	 
		for (int e : num) {
			int left = e - 1;
			int right = e + 1;
			int count = 1;
	 
			while (set.contains(left)) {
				count++;
				set.remove(left);
				left--;
			}
	 
			while (set.contains(right)) {
				count++;
				set.remove(right);
				right++;
			}
	 
			max = Math.max(count, max);
		}
	 
		return max;
	}
}
