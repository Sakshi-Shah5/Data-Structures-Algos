//leet 876
public class MiddleElement {
	 public static ListNode middleNode(ListNode head) {
	        if(head == null){
	            return null;
	        }
	        
	        ListNode fast = head;
	        ListNode slow = head;
	        
	        while(fast != null && fast.next !=null){
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	    }
	 
	 public static void display(ListNode head) {
			ListNode current = head;
			while(current != null) {
				System.out.print(current.val + " --> ");
				current = current.next;
			}
			System.out.println("null");
		}
	 
	 public static void main(String[] args) {
		 ListNode head = new ListNode(1);
			ListNode second = new ListNode(2);
			ListNode third = new ListNode(3);
			ListNode fourth = new ListNode(4);
			ListNode fifth = new ListNode(5);
			ListNode sixth = new ListNode(6);
				
			head.next = second;
			second.next = third;
			third.next = fourth;
			fourth.next = fifth;
			fifth.next = sixth;
			
			display(head);
			System.out.println(middleNode(head).val);
	 }
}
