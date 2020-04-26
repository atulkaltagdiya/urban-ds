package edu.learning.ds.tree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

import edu.learning.ds.tree.pojo.Node;

public class TreeOperation {

	@SuppressWarnings("unchecked")
	public Integer getMaxByRecursion(Node<Integer> root) {
		int tmp;
		if (Objects.isNull(root))
			return null;

		int left = getMaxByRecursion(root.getLeft());
		int right = getMaxByRecursion(root.getRight());

		tmp = left > root.getData() ? left : root.getData();
		return tmp > right ? tmp : right;
	}

	@SuppressWarnings("unchecked")
	public Integer getMaxByIteration(Node<Integer> root) {
		if (root == null)
			return null;
		Queue<Node<Integer>> queue = new LinkedList<>();

		int max = Integer.MIN_VALUE;
		Node<Integer> tmp;
		queue.add(root);
		while (!queue.isEmpty()) {
			tmp = queue.poll();
			if (tmp.getLeft() != null)
				queue.add(tmp.getLeft());
			if (tmp.getRight() != null)
				queue.add(tmp.getRight());

			max = tmp.getData() > max ? tmp.getData() : max;

		}
		return max;
	}

}
