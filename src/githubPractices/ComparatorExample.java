package githubPractices;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(4);
		list.add(7);
		list.add(8);
		list.add(5);
		list.add(6);
		
		System.out.println("Before---");
		for(Integer i : list) {
			System.out.println(""+ i);
		}
		
		Set<Integer> result = new TreeSet<Integer>(new Comparator<Integer>()  {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return Integer.valueOf((int) (o2 - o1));
			}
			
		});
		
		for(Integer obj : list)  {
			result.add(obj);
		}
		
		System.out.println("After---");
		
		for(Integer i : result) {
			System.out.println(""+ i);
		}
	}

}
