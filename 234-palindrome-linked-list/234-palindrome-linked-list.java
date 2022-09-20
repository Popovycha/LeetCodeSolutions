/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // Get to the Mid of the Linked List
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
         // Reverse the second half of the Linked list from mid found above
        // slow == mid of the linked list
        ListNode prev = null;
        while(slow != null)
        {
            ListNode tmp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = tmp;
        }
        // Iterate through first and second half and check if they are same/equal.
        while(prev != null)
        {
            if(prev.val != head.val)
                return false;
            
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
}