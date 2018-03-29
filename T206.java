/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class T206 {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null) {
           ListNode next = head.next;
           head.next = prev;
           prev = head;
           head = next;
        }
        return prev;
    }
    
    public static void main(String[] args) {
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(2);
    	ListNode node3 = new ListNode(3);
    	ListNode node4 = new ListNode(4);
    	ListNode node5 = new ListNode(5);
    	node1.next = node2;
    	node2.next = node3;
    	node3.next = node4;
    	node4.next = node5;
    	
    	ListNode node = reverseList(node1);
    	System.out.println(node.val+"  ");
    	for(ListNode i = node;i!= null;i = i.next) {
    		System.out.print(i.val+"  ");
    	}
    }
    
   
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

