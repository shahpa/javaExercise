package githubPractices.array;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] result = twoSumMethod(nums, target);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

	private static int[] twoSumMethod(int[] nums, int target) {
		// TODO Auto-generated method stub
		if(nums == null || nums.length<2)  {
			return new int[] {0,0};
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int  i = 0 ; i<nums.length; i++)  {
			if(map.containsKey(nums[i]))  {
				return new int[] {map.get(nums[i]), i};
			}
			else  {
				map.put(target-nums[i], i);
			}
		}
		return new int[] {0,0};
	}

}
