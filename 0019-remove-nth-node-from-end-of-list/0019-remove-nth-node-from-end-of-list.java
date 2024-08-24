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
        if(head==null){
            return null;
        }
        int p1=0;
        ListNode curr=head;
        while(curr!=null){
            p1++;
            curr=curr.next;
        }
        int p2=p1-n;
    
        ListNode newCurr=head;
        
        if(p2==0){
            return head.next;
        }
        while(p2!=1){
            newCurr=newCurr.next;
            p2--;
        }
       newCurr.next=newCurr.next.next;
        
        return head;
    }
}