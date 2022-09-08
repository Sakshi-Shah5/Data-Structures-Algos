//leetcode 203

public class RemoveElement {
	
	public static ListNode removeElement(ListNode head, int val) {
		  ListNode fakeHead = new ListNode(-1);
	     fakeHead.next = head;
	     ListNode current = head;
	     ListNode previous = fakeHead;
	     
	     while(current != null){
	         if(current.val == val){
	             previous.next = current.next;
	         }
	         else{
	             previous = previous.next;
	               
	         }
	       current = current.next;
	         
	     }
	   
	     return fakeHead.next;
	     
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
	
	 
 	ListNode head = new ListNode(1);
	ListNode second = new ListNode(2);
	ListNode third = new ListNode(6);
	ListNode fourth = new ListNode(3);
	ListNode fifth = new ListNode(4);
	ListNode sixth = new ListNode(5);
	ListNode seventh = new ListNode(6);
	
	
	head.next = second;
	second.next = third;
	third.next = fourth;
	fourth.next = fifth;
	fifth.next = sixth;
	sixth.next = seventh;

	
	
	display(head);
	
	removeElement(head,6);
	
	display(head);
 
 
 
}
}
