
public class SinglyLinkedList {
	
	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
	public void display(ListNode head) {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public int length() {
		if(head == null) {
			return 0;
		}
		
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void insert(int position, int value) {
		ListNode newNode = new ListNode(value);
		if(position == 1) {
			newNode.next = head;
			head = newNode;
		}
		else {
			ListNode previous = head;
			int count = 1;
			
			while(count < position - 1) {
				previous = previous.next;
				count++;
			}
			
			ListNode current = previous.next;
			previous.next = newNode;
			newNode.next = current;
		}
		
		
		
	}
	
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			head = newNode;
			return;
		}
		
		ListNode current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	
	public ListNode deleteFirst() {
		if(head == null) {
			return null;
		}
		else {
			ListNode temp = head;
			head = head.next;
			temp.next = null;
			return temp;
		}
	}
	
	
	public void delete(int position) {
		if(position == 1) {
			head = head.next;
		}
		
		else {
			ListNode previous = head;
			int count = 1;
			while(count < position - 1) {
				previous = previous.next;
				count++;
			}
			
			ListNode current = previous.next;
			previous.next = current.next;
		}
	}
	
	public ListNode deleteLast() {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		
		while(current.next !=null) {
			previous = current;
			current = current.next;
			
		}
		
		previous.next = null;
		return current;
	}
	
	public boolean search(ListNode head, int searchKey) {
		if(head == null) {
			return false;
		}
		
		ListNode current = head;
		while(current != null) {
			if(current.data == searchKey) {
				return true;
			}
			
			
			current = current.next;
		}
		return false;
	}
	
	
	public ListNode reverse(ListNode head) {
		if(head == null) {
			return head;
		}
		ListNode current = head ;
		ListNode previous = null;
		ListNode next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public ListNode getMiddleNode() {
		if(head == null) {
			return null;
		}
		
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		SinglyLinkedList sll = new SinglyLinkedList();
	//	sll.display();
		
		

		if(sll.search(head, 11)) {
			System.out.println("Search key found");
		}
		else {
			System.out.println("Search key not found");
		}
		
		
		
		
 //		System.out.println("Length of the Linked List is: " + sll.length());
 //		sll.insertFirst(9);
 // 	sll.insertLast(14);
 //		sll.insertLast(17);
		
		
		sll.insert(1, 3);
		sll.insert(2,5);
		sll.insert(3, 7);
		sll.insert(1, 64);
		sll.insert(4, 65);
		
		
 		
		
		sll.display(head);
		
		sll.deleteFirst();
		sll.display(head);
		
	//	sll.deleteLast();
    //	sll.display(head);
		
		sll.insert(3, 8);
		sll.display(head);
		
	//	sll.delete(2);
	//	sll.display(head);	  
		
		
		
		ListNode reverseListHead = sll.reverse(head);
		sll.display(reverseListHead);
		
		ListNode middleNode = sll.getMiddleNode();
		System.out.println("Middle Node is: " + middleNode.data);
		
	
	
		
		
		
		
		
		
		
	}

}
