package edu.learning.ds.tree;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import edu.learning.ds.tree.pojo.Node;

public class BuildTreeTest {

	@Test
	public void testIfTreeCreated() {
		String[] in = { "d", "b", "e", "a", "f", "c" };
		String[] pre = { "a", "b", "d", "e", "c", "f" };
		BuildTree<String> obj = new BuildTree<>();
		Node<String> root = obj.buildTree(in, pre, 0, in.length - 1);
		Assert.assertNotNull(root);
		List<String> response = obj.inOrderTreeRepresentation(root, new ArrayList<String>());
		Assert.assertArrayEquals(in, response.toArray(new String[0]));
	}

}
