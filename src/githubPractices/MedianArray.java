package githubPractices;

public class MedianArray {

	public static void main(String[] args) {
		int[] array1 = new int[]{1,2,3};
		int[] array2 = new int[]{3,4,5};
		
		//object for finding a median
		MedianClass obj = new MedianClass();
		int ans = obj.findMedian(array1, 0, array1.length-1, array2, 0, array2.length-1);
		System.out.println(ans);
		System.out.println( " " + findMedian(array1));
		

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


