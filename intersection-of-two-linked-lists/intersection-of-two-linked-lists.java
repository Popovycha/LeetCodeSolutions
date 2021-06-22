/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        
        //Use of two pointer and traversing thru nodes.
        //Traverse both and when the shorter will get to the end.
        //It will be set to the longer one.
        ListNode a_point = headA;
        ListNode b_point = headB;
        
        while (a_point != b_point) {
            
            if(a_point == null) {
               a_point = headB;
            } else {
                a_point = a_point.next;
            }
            
            if(b_point == null) {
               b_point = headA;
            } else {
                b_point = b_point.next;
            }
            
        }
        return a_point;
    }
}