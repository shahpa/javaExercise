package githubPractices.lists;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Merge two sorted lists
		 * update: this class is failing after counter is larger than size of a list
		 */
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(7);
		list1.add(9);
		
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(8);
		list2.add(10);
		
		System.out.println("List 1 elements are : ");
		for(int e : list1)  {
			System.out.println(e);
		}
		
		System.out.println("List 2 elements are : ");
		for(int e : list2)  {
			System.out.println(e);
		}
		
		List<Integer> resultList = mergeLists(list1, list2);
		System.out.println("Result List elements are : ");
		for(int e : resultList)  {
			System.out.println(e);
		}
		
	}

	private static List<Integer> mergeLists(List<Integer> list1,
			List<Integer> list2) {
		
		List<Integer> resultList = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		int count1 = 0;
		int count2 = 0;
		while(list1 != null || list2 != null)  {
			if(list1!=null && list2!=null)  {
				if(count1<list1.size() && count2<list2.size())  {
					if(list1.get(count1) <= list2.get(count2)) {
						resultList.add(list1.get(count1));
						count1++;
					}
					if(list1.get(count1) > list2.get(count2))  {
						resultList.add(list2.get(count2));
						count2++;
					}
				}
			
				if(list1 ==null)  {
					for(int e= count1;e<list2.size(); e++)  {
						resultList.add(list2.get(e));
					}
				}
				if(list2 ==null)  {
					for(int e= count1;e<list1.size(); e++ )  {
						resultList.add(list1.get(e));
						
					}
				}
			}
		}
		return resultList;
	}

}
