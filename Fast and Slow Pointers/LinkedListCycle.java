//leetcode 141 

class ListNode{
	int val;
	ListNode next;
	
	ListNode(int x){
		val = x;
		next = null;
	}

}
public class LinkedListCycle {
	
 public static boolean hasCycle(ListNode head) {
     ListNode slow = head;
     ListNode fast = head;
     
     
     while(fast != null && fast.next != null){
         slow = slow.next;
         fast = fast.next.next;
         
         if(slow == fast){
             return true;
         }
     }
    return false; 
 }
 
 public static void main(String args[]) {
	
	 
	 	ListNode head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
	
		fourth.next = second;
		
		System.out.print(hasCycle(head));
	 
	 
	 
 }
}
