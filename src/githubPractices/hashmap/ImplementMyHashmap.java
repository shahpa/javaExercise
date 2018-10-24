package githubPractices.hashmap;

public class ImplementMyHashmap {

	public static void main(String[] args)  {
		System.out.println("Simple hashmap implementation without hashmap.");
		
		MyHashmap map = new HashmapImpl();
		map.put("a", "apple");
		System.out.println("Value stored");
		map.put("b", "ball");
		System.out.println("Value stored");
		map.put("c", "cat");
		System.out.println("Value stored");
		System.out.println("value of key : b is : "+ map.get("b"));
		System.out.println("value of key : a is : "+ map.get("a"));
		System.out.println("value of key : c is : "+ map.get("c"));
	}
}
