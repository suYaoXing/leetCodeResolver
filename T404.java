
public class T404 {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(9);
		TreeNode node2 = new TreeNode(20);
		TreeNode node3 = new TreeNode(15);
		TreeNode node4 = new TreeNode(7);
		root.left = node1;
		root.right = node2;
		node2.left = node3;
		node2.right = node4;
		
		System.out.println(sumOfLeftLeaves(root));
	}
	
	public static int sumOfLeftLeaves(TreeNode root) {
		
		int sum = 0;
		if(root == null)
			return 0;
		if(root.left != null) {
			if(root.left.left == null && root.left.right == null)
				sum = sum + root.left.val;
			else
			    sum = sum + sumOfLeftLeaves(root.left);
		}
		sum = sum + sumOfLeftLeaves(root.right);
		return sum;
    }
	
}

class TreeNode {
	
	TreeNode(int x) {
		this.val = x;
	}
	
    int val;
    TreeNode left;
    TreeNode right;
}
