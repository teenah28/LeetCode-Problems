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
    public ListNode middleNode(ListNode head) {
       if(head==null || head.next==null) return head;
       ListNode prev=null;
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null){
         prev=slow;
        slow=slow.next;
        fast=fast.next.next;
       } 
       return slow;
    }
}