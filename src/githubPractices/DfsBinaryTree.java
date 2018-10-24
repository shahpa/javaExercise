package githubPractices;

class TreeNode  {
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data)  {
		this.data = data;
		this.left = null;
		this.right = null;
	}

}
public class DfsBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		
		dfsMethod(root);
	}

	private static boolean dfsMethod(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null)   {
			return false;
		}
		if(root.left == null && root.right == null)  {
			System.out.println(" "+ root.data);
			return true;
		}
		return (dfsMethod(root.left) && dfsMethod(root.right));
	}

}
