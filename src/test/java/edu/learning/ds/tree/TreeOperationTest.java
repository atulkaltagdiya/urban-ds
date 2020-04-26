package edu.learning.ds.tree;

import org.junit.Assert;
import org.junit.Test;

import edu.learning.ds.tree.pojo.Node;

public class TreeOperationTest {

	@Test
	public void testMaxByRecursion() {
		Integer[] in_order = { 45, 22, 12, 4, 16, 76 };
		Integer[] pre_order = { 4, 22, 45, 12, 76, 16 };
		BuildTree<Integer> obj = new BuildTree<>();
		Node<Integer> root = obj.buildTree(in_order, pre_order, 0, in_order.length - 1);
		Assert.assertNotNull(root);
		Integer response = new TreeOperation().getMaxByRecursion(root);
		Assert.assertNotNull(response);
		Assert.assertEquals(76, response.intValue());
	}

	@Test
	public void testMaxByIteration() {
		Integer[] in_order = { 45, 22, 12, 4, 16, 76 };
		Integer[] pre_order = { 4, 22, 45, 12, 76, 16 };
		BuildTree<Integer> obj = new BuildTree<>();
		Node<Integer> root = obj.buildTree(in_order, pre_order, 0, in_order.length - 1);
		Assert.assertNotNull(root);
		Integer response = new TreeOperation().getMaxByIteration((root));
		Assert.assertNotNull(response);
		Assert.assertEquals(response.intValue(), 76);
	}

}
