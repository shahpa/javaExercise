package githubPractices;

public class CohesityProblem {

	
	import java.io.*;
	import java.util.*;

	/*
	 * To execute Java, please define "static void main" on a class
	 * named Solution.
	 *
	 * If you need more classes, simply define them inline.
	 */

	/**
	*  1
	*2 3 4
	*5 6 78


	* queue :
	* node : 8
	print : 1 2 3 4 5 6 7 8 
	**/

	
	  public static void main(String[] args) {
	    ArrayList<String> strings = new ArrayList<String>();
	    strings.add("Hello, World!");
	    strings.add("Welcome to CoderPad.");
	    strings.add("This pad is running Java 8.");

	    for (String string : strings) {
	      System.out.println(string);
	    }
	    Node1 root = new Node1(1);
	    treeTraverse(root);
	  }
	  
	  public static void treeTraverse(Node1 root)  {
	    
	    
	    LinkedList<Node1> queue = new LinkedList<Node1>();
	    queue.add(root);
	    
	    while(!queue.isEmpty())  {
	      Node1 node = queue.remove(0);
	    
	      for(Node1 n : node.nodeList)  {
	        queue.add(n);
	      }  
	    }
	    
	    System.out.println(root.data);
	  }
}

	class Node1  {
	  int data;
	  List<Node1> nodeList = new ArrayList<Node1>();
	  Node1(int data)  {
	    Node1 n = new Node1();
	    n.data = data;
	  }
	}


