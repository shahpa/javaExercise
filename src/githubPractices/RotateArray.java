package githubPractices;

public class RotateArray {
	public static void main(String args[])  {
		//rotate an array of n element to the right by k steps
		int[] nums = new int[7];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		nums[5] = 6;
		nums[6] = 7;
		
		int k = 9;
		
		 if(k > nums.length) 
		        k=k%nums.length;
		 
		    int[] result = new int[nums.length];
		 
		    for(int i=0; i < k; i++){
		        result[i] = nums[nums.length-k+i];
		    }
		 
		    int j=0;
		    for(int i=k; i<nums.length; i++){
		        result[i] = nums[j];
		        j++;
		    }
		 
		    System.arraycopy( result, 0, nums, 0, nums.length );
		    for(int i = 0; i<nums.length; i++)  {
		    	System.out.println("/" + nums[i]);
		    }
	}
}
