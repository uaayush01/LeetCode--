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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
       ListNode prev=null;
       ListNode pre=head;
       ListNode next = pre.next;
       while(pre!=null){
         pre.next=prev;
         prev=pre;
         pre=next;
         if(next!=null){
            next=next.next;
         }
       } 
       return prev;
    }
}