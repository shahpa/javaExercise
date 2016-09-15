package githubPractices;

import java.util.*;

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Intervals> list = new ArrayList<Intervals>();
		
		list.add(new Intervals(9, 12));
		list.add(new Intervals(4, 7));
		list.add(new Intervals(8, 10));
		
		System.out.println("List is : " + list);
		
		System.out.println(merge(list));
		
	}

	private static ArrayList<Intervals> merge(ArrayList<Intervals> list) {
		Collections.sort(list, new Comparator<Intervals>()  {
			public int compare(Intervals i1, Intervals i2)  {
				if(i1.lo == i2.lo)  {
					return i1.hi - i2.hi;
				}
				return i1.lo - i2.lo;
			}
		});
		System.out.println("Sorted List is : " + list);
		return list;
	}

}

class Intervals {
	int lo;
	int hi;
	Intervals()  {
		int lo = 0;
		int hi = 0;
	}
	
	Intervals(int lo, int hi)  {
		this.lo = lo; 
		this.hi = hi;
	}
	
	@Override
	public String toString()  {
		return("[" + lo + "," + hi + "]");
	}
}
