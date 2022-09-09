//leetcode 92 -> Reverse Linked List II

// reference : https://www.youtube.com/watch?v=BE0hruM5O5U

/*
 approach : 
 start at 2nd element of the sublist(part to be reversed), extract it out and place it in the
  front of sublist, then go to next element extract it and place it in the front of sublist 
 */

package leetcode_problems;

public class ReverseLL2 {
	
	public static ListNode reverseBetween(ListNode head, int start, int end) {
		
		if(head == null || start == end)
            return head;
		
		ListNode fakeHead = new ListNode(0);
		fakeHead.next = head;
		
		ListNode nodeBeforeSublist = fakeHead;
		int position = 1;
		
		while(position < start) {
			nodeBeforeSublist = nodeBeforeSublist.next;
			position++;
		}
		
		ListNode workingPtr = nodeBeforeSublist.next;
		
		while(start < end) {
			ListNode nodeToBeExtracted = workingPtr.next;
			workingPtr.next = nodeToBeExtracted.next;
			nodeToBeExtracted.next = nodeBeforeSublist.next;
			nodeBeforeSublist.next = nodeToBeExtracted;
			
			start++;
		}
		
		
		
		return fakeHead.next;
	}
	
	public static void display(ListNode head) {
		ListNode current = head;
		
		while(current != null) {
			System.out.print(current.val + "->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String args[]) {
		
		ListNode head = new ListNode(1);
		ListNode first = new ListNode(2);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(4);
		ListNode fourth = new ListNode(5);
	
		
		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = null;
		
		
		display(head);
		reverseBetween(head,2,4);
		display(head);
		
	}
}
