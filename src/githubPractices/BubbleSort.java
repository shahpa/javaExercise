package githubPractices;

public class BubbleSort {

	public void doBubbleSort(int[] inputArray) {
			boolean flag = true;
		for(int j = 0; j<inputArray.length-1; j++)  {
			flag = false;
			for(int i = 0; i<inputArray.length-1; i++)  {
				if(inputArray[i]>inputArray[i+1])  {
					int tmp = 0;
					tmp = inputArray[i+1];
					inputArray[i+1] = inputArray[i];
					inputArray[i] = tmp;
					flag = true;
				}
			}
			System.out.println("New itteration");
			for(int i = 0 ; i < inputArray.length; i++)  {
				System.out.println("/" + inputArray[i]);
			}
		}
	}

}
