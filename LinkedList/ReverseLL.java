//leetcode 206

public class ReverseLL {
	
	public static ListNode reverse(ListNode head) {
		
		if(head == null){
         	   return head;
       		 }
		
		ListNode current = head;
		ListNode previous= null;
		ListNode next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current= next;
		}
		
		return previous;
	}
	
	public static void display(ListNode head) {
		ListNode current = head;
		
		while(current != null) {
			System.out.print(current.val + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String args[]) {
		ListNode head = new ListNode(0);
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		
		head.next = first;
		first.next = second;
		second.next = third;
		third.next = null;
		
		display(head);
		ListNode temp = reverse(head);
		display(temp);
		
		
	}

}
