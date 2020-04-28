package edu.learning.ds.tree;

import java.util.List;

public class BuildTreeByInOrderPreOrderValues<T> {

	public static int preOrderIndex = 0;

	public Node<T> buildTree(T[] in, T[] pre, int strIndex, int end) {
		if (strIndex > end)
			return null;

		Node<T> node = new Node<T>(pre[preOrderIndex++]);
		if (strIndex == end)
			return node;

		int index = search(in, node.getData());
		node.setLeft(buildTree(in, pre, strIndex, index - 1));
		node.setRight(buildTree(in, pre, index + 1, end));

		return node;
	}

	private int search(T[] inOrder, T data) {
		int index = 0;
		//remove this fr with lambdas
		for (T val : inOrder) {
			if (val == data)
				return index;
			index++;
		}
		return index;
	}

	List<T> inOrderTreeRepresentation(Node<T> root, List<T> inOrder) {
		return inOrderTreeRepresentation_internal(root, inOrder);
	}

	@SuppressWarnings("unchecked")
	private List<T> inOrderTreeRepresentation_internal(Node<T> root, List<T> inOrder) {
		if (root == null)
			return null;
		inOrderTreeRepresentation_internal(root.getLeft(), inOrder);
		inOrder.add(root.getData());
		inOrderTreeRepresentation_internal(root.getRight(), inOrder);
		return inOrder;
	}
}
