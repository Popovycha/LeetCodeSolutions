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
    public ListNode removeElements(ListNode head, int val) {
        //dummy to point to the start of the list
        ListNode newHead = new ListNode(0);
        newHead.next = head;

        //loop thru and remove val
        ListNode temp = newHead;

        while(temp.next != null) {
            if(temp.next.val == val) {
                // Set the next pointer of the current node to the node after the next one,
                // effectively removing the node with the given value from the list.
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        
     return newHead.next;
    }
}