package githubPractices;

public class PrioritySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	public static int getPriority(String productCode)  {
		return 1;
	}

	public static void OrderProductsByPriority(String[] productCodes) {
		int current =0;
		int lo = 0;
		int hi = productCodes.length;
		
		while(current > hi)  {
			int currentPriority = getPriority(productCodes[current]);
			if(currentPriority < getPriority(productCodes[current++])) {
				if(currentPriority == getPriority(productCodes[current++]))  {
					lo = current + 1;
				}
				hi--;
			}
			
			if(getPriority(productCodes[current]) == 1)  {
				
			}
			
			current++;
		}
		
	}
	
	public static void swap(String productCodes, String productCodes2)  {
		String tmp = productCodes;
		productCodes = productCodes2;
		productCodes2 = tmp;
	}
	
}
