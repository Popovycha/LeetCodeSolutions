/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
         if (head == null) return false;
        //two pointer
        ListNode slow = head; // goes to first next node
        ListNode fast = head.next; //jump to second node
        
        while (slow != fast) {
            
            if(fast == null || fast.next == null){
                return false;
            }
            
            slow = slow.next; // moving one in the time
            fast = fast.next.next; //moving two in the time
        }
        return true;
    }
}