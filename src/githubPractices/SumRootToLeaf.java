package githubPractices;

class TreeNode1  {
	int val;
	TreeNode1 left;
	TreeNode1 right;
	
	public TreeNode1(int val)  {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class SumRootToLeaf {

	public int sumNumbers(TreeNode1 root) {
	    if(root == null) 
	        return 0;
	 
	    return dfs(root, 0, 0);
	}
	 
	public int dfs(TreeNode1 node, int num, int sum){
	    if(node == null) return sum;
	 
	    num = num*10 + node.val;
	 
	    // leaf
	    if(node.left == null && node.right == null) {
	    	System.out.println(num);
	        sum += num;
	        return sum;
	    }
	 
	    // left subtree + right subtree
	    sum = dfs(node.left, num, sum) + dfs(node.right, num, sum);
	    return sum;
	}
	
	public String printPath(TreeNode1 node, String path)  {
		
		if(node == null) return null;
		
		if(node.left == null && node.right == null)  {
			return String.valueOf(node.val);
		}
		
		path = path + " " + printPath(node.left, path) + " " ;
		System.out.println(path);
		path = " ";
		path = path + " " + printPath(node.right, path) + " ";
		System.out.println(path);
		
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode1 root = new TreeNode1(1);
		root.left = new TreeNode1(2);
		root.right = new TreeNode1(30);
		root.left.left = new TreeNode1(40);
		root.left.right = new TreeNode1(5);
		root.right.left = new TreeNode1(6);
		root.right.right = new TreeNode1(7);
		
		SumRootToLeaf obj = new SumRootToLeaf();
		System.out.println(obj.sumNumbers(root));
		
		//System.out.println(obj.printPath(root, " "));

	}
	
	

}
