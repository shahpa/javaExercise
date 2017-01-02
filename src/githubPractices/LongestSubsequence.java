package githubPractices;

public class LongestSubsequence {
	int max = 0;

	public int longestSubsequesnce(TreeNode root) {
		helper(root);
		return max;
	}

	public int helper(TreeNode root) {
		if (root == null)
			return 0;

		int l = helper(root.left);
		int r = helper(root.right);

		int fromLeft = 0;
		int fromRight = 0;

		if (root.left == null) {
			fromLeft = 1;
		} else if (root.left.data - 1 == root.data) {
			fromLeft = l + 1;
		} else {
			fromLeft = 1;
		}

		if (root.right == null) {
			fromRight = 1;
		} else if (root.right.data - 1 == root.data) {
			fromRight = r + 1;
		} else {
			fromRight = 1;
		}

		max = Math.max(max, fromLeft);
		max = Math.max(max, fromRight);

		return Math.max(fromLeft, fromRight);
	}

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		TreeNode root = new TreeNode(7);
		bst.insert(root, 5);
		bst.insert(root, 21);
		bst.insert(root, 4);
		bst.insert(root, 6);
		bst.insert(root, 19);
		bst.insert(root, 23);
		bst.insert(root, 17);
		bst.insert(root, 20);
		bst.insert(root, 22);
		bst.insert(root, 24);
		bst.insert(root, 16);
		bst.insert(root, 18);

		BTreePrinter.printNode(root);

	}
}




