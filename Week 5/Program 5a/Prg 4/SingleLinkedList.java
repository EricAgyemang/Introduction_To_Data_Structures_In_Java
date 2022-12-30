package eagyem2ilstu;

//This is a class of Single linked list
public class SingleLinkedList {

	// The head of the node is set
	private Node head = new Node(-1);
	public int size = 0;

	// The add method is defined to add a node
	public void add(Object item) {
		addAfter(item, getNode(size));
	}

	// This method checks for index and size when the node is inserted
	public void add(Object item, int index) {
		if (index < 0 || index > size) {
			return;
		}

		if (index == 0) {
			addFirst(item);
		} else {
			addAfter(item, getNode(index - 1));
		}
	}

	// This is an add first method
	public void addFirst(Object item) {
		Node first = new Node(item); // Create new first Node
		first.next = head.next;
		head.next = first;
		size++;
	}

	// This is the add after method
	public void addAfter(Object item, Node target) {
		Node after = new Node(item);
		after.next = target.next;
		target.next = after;
		size++;
	}

	// This is the remove first method
	public Object removeFirst() {
		if (size > 0) {
			Node first = head.next;
			head.next = first.next;
			size--;

			return first.data;
		}

		return null;
	}

	// This is the remove after method
	public Object removeAfter(Node target) {
		if (target.next != null) {
			Node after = target.next;
			target.next = after.next;
			size--;

			return after.data;
		}

		return null;
	}

	// This is a get node method
	public Node getNode(int index) {
		Node node = head;

		for (int i = 0; i < index && node != null; i++) {
			node = node.next;
		}

		return node;
	}

	// Custom printList for cards
	public void printList(Node head) {
		Node temp = head.next;

		// We printing at node AFTER head
		while (temp != null) {
			System.out.print(temp.data.toString() + " ");
			temp = temp.next;
		}
	}

	// This is the inner class of node
	public static class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
	}

}