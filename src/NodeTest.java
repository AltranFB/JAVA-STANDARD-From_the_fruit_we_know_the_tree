import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NodeTest {
	private Node TreeRoot;

	@Before
	public void setUp() throws Exception {
		this.TreeRoot = new Node(9);
        TreeRoot.left = new Node(7);
        TreeRoot.left.left = new Node(5);
        TreeRoot.left.right = new Node(8);
        TreeRoot.left.left.left = new Node(2);
        TreeRoot.left.left.right = new Node(6);
        TreeRoot.right = new Node(13);
        TreeRoot.right.right = new Node(17);
        TreeRoot.right.left = new Node(16);
	}

	@Test
	public void Test1() {
		Node n = TreeRoot.Find(8);
		assertNotEquals("Node existing ?", null, n);
		assertEquals("Node found", 8, n.value);
	}

	@Test
    public void Test2() {
		Node n = TreeRoot.Find(4);
		assertEquals("Node not found", null, n);
	}
}
