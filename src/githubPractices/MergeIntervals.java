package githubPractices;

import java.util.*;

public class MergeIntervals {

	public static void main(String[] args) {
		

		ArrayList<Intervals> list = new ArrayList<Intervals>();
		
		list.add(new Intervals(8, 10));
		list.add(new Intervals(1, 3));
		list.add(new Intervals(2, 6));
		list.add(new Intervals(3, 9));
		list.add(new Intervals(15, 18));
		
		System.out.println("List is : " + list);
		
		System.out.println("merged list is : " + merge(list));
		
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
		ArrayList<Intervals> result = new ArrayList<Intervals>();
		Intervals prev = list.get(0);
		result.add(prev);
		for(int i=1; i<list.size(); i++)  {
			Intervals current = list.get(i);
			
			if(prev.hi >= current.lo)  {
				Intervals newInterval = new Intervals(prev.lo, Math.max(prev.hi, current.hi));
				prev = newInterval;
			}
			else  {
				prev = current;
			}
			
			removeIfExitst(result, prev);
			result.add(prev);
		}
		return list;
	}

	private static void removeIfExitst(ArrayList<Intervals> result,
			Intervals prev) {
		// TODO Auto-generated method stub
		if(result.size()>0)  {
			Intervals existing = result.get(result.size()-1);
			if(existing.lo == prev.lo)  {
				result.remove(result.size()-1);
			}
		}
		
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
