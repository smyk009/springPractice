package JavaPractice;

public class LinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	void printMiddle() {
		Node slow = head;
		Node fast = head;

		if (head != null) {
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			System.out.println("Middle Element: " + slow.data);
		}
	}

	public void push(int new_data) {
		Node newNode = new Node(new_data);
		newNode.next = head;
		head = newNode;
	}

	public boolean findCycle() {
		boolean cycle = false;
		Node slow = head;
		Node fast = head;

		if (head != null) {
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
				if (slow == fast) {
					cycle = true;
				}
			}

		}
		return cycle;
	}

	public void reverseList() {
		Node current = head;
		Node previous = null;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			
			System.out.print(previous.data);
		}
		
	}

	public void print() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println("");
	}
	
	public int findNode(int node) {
		Node fast = head;
		Node slow = head;
		
		int count = 1;
		while(count<node-1) {
			fast = fast.next;
			count++;
		}
		while(fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		
		return slow.data;
		
	}
	
	public int sizeOfList() {
		Node node = head;
		int count = 0;
		while(node.next != null) {
			node = node.next;
			count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.push(1);
		llist.push(2);
		llist.push(3);
		llist.push(4);
		llist.push(5);
		llist.push(6);
		System.out.println("Cycle: " + llist.findCycle());
		//llist.reverseList();
		System.out.println("Node is: "+llist.findNode(4));
		System.out.println("List Size: "+ llist.sizeOfList());
		//llist.print();

	}

}
