
// @ author Deep Patel
// @ Binary trees
// @ Checking if both the trees are identical or different

// A class to store a binary tree node
class Node
{
	int child;
	Node left = null, right = null;

	Node(int child) {
		this.child= child;
	}
}

class Main
{
	// Recursive function to check if two given binary trees are identical or not
	public static boolean isIdentical(Node x, Node y)
	{
		
		if (x == null && y == null) // if null, return true
		{
			return true;
		}

		
		return (x != null && y != null) && (x.child== y.child) &&    // if non-empty and root node matches,
					isIdentical(x.left, y.left) &&					// recur for their left and right subtree
					isIdentical(x.right, y.right);
	}

	public static void main(String[] args)
	{
		// construct the first tree
		Node x = new Node(15);
		x.left = new Node(10);
		x.right = new Node(20);
		x.left.left = new Node(8);
		x.left.right = new Node(12);
		x.right.left = new Node(16);
		x.right.right = new Node(25);

		// construct the second tree
		Node y = new Node(15);
		y.left = new Node(10);
		y.right = new Node(20);
		y.left.left = new Node(8);
		y.left.right = new Node(10);
		y.right.left = new Node(16);
		y.right.right = new Node(25);

		if (isIdentical(x, y)) {
			System.out.print("Wow ! They are identical !");
		}
		else {
			System.out.print("Sorry ! They are different !");
		}
	}
}
