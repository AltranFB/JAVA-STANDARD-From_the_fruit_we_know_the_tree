public class Node {
	Node left, right;
	int value;

	public Node() {
		this(0);
	}

	public Node(int val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }

	public Node Find(int v) {
		Node cNode = this;
		while (true)
		{
			if (cNode.value == v)
				return cNode;
			
			if (cNode.value > v) {
				if (cNode.left == null)
					return null;
				cNode = cNode.left;
			} else {
				if (cNode.right == null)
					return null;
				cNode = cNode.right;
			}
		}
	}
}
