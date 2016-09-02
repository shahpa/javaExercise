package githubPractices;

public class MedianArray {

	public static void main(String[] args) {
		int[] array1 = new int[]{1,2,3,4,5,6,7, 8};
		int[] array2 = new int[]{5,6,7,8,9,10,11};
		
		System.out.println( "" + findMedian(array1));
		

	}
	
	static int findMedian(int[] array)  {
		int size = array.length;
		int median;
		if(size%2 == 0)  {
			median = (array[size/2] + array[size/2 - 1])/2; 
		}
		else  {
			median = array[size/2];
		}
		return median;
	}

}
