package githubPractices;

public class TreeHeight {

	public static void main (String[] args)  {
		Node root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(25);
		root.left.right = new Node(30);
		root.left.left.left = new Node(35);
		root.left.left.right = new Node(40);

		TreeHeight height = new TreeHeight();
		int result = height.findHeight(root);	
		System.out.println(result);
	}


	public int findHeight(Node root)  {
		if(root == null)  {
			return 0;
		}
		return 1+Math.max(findHeight(root.left), findHeight(root.right));
	}
}

class Node  {
	
	int data;
	Node left;
	Node right;
	public Node(int data)  {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
