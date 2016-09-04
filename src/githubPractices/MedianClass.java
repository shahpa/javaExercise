package githubPractices;

public class MedianClass {

	public int findMedian(int[] array1, int start1, int end1, int[] array2, int start2, int end2)  {
		
		if(array1.length == 2) {
			return Math.max(array1[start1], array2[start2]) + Math.min(array1[start1+1], array2[start2+1]);
		}
		
		int m1 = getMedian(array1, start1, end1);
		int m2 = getMedian(array2, start2, end2);
		
		if(m1 == m2)  {
			System.out.println("The m1 and m2 are same, so the median is : " + m1);
			return m1;
		}
		
		else if (m1 > m2)  {
			findMedian(array1, 0, m1, array2, m2, end2);
		}
		else if (m2 > m1)  {
			findMedian(array1, m1, end1, array2, 0, m2);
		}
		return 0;
		
	}

	private int getMedian(int[] array, int start, int end) {
		int size = end - start + 1;
		int median;
		if(size%2 == 0)  {
			median = (array[size/2 + start] + array[(size/2 - 1) + start])/2; 
		}
		else  {
			median = array[size/2 + start];
		}
		return median;
	}
}
