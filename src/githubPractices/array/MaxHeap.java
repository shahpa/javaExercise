package githubPractices.array;

public class MaxHeap {

	private int[] maxHeap;
	private int pos;
	private int capacity;
	

	public MaxHeap()  {
		pos = 1;
		capacity = 10;
		maxHeap = new int[capacity];
	}
	
	public void insert(int value)  {
		if(pos == capacity)  {
			//Increase capacity
		}
		else  {
			maxHeap[pos++]  = value;
			
			int child = pos - 1;
			int parent = child/2;
			
			while(maxHeap[parent] < maxHeap[child] && parent>0 )  {
				int tmp = maxHeap[child];
				maxHeap[child] = maxHeap[parent];
				maxHeap[parent] = tmp;
				
				child = parent;
				parent = child / 2;		
			}
		}
	}
	
	public void print() {
		for(int i=0;i<pos;i++)  {
			System.out.println(maxHeap[i] + " ");
		}
	}
}
