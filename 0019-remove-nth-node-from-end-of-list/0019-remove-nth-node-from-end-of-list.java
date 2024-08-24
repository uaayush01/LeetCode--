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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null){
            return null;
        }
        int length=0;
        ListNode curr=head;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        int size=length-n;
    
        ListNode newCurr=head;
        // ListNode prev=null;
        if(size==0){
            return head.next;
        }
        while(size!=1){
            newCurr=newCurr.next;
            size--;
        }
       newCurr.next=newCurr.next.next;
        
        return head;
    }
}