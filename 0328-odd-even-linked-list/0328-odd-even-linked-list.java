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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode odd =new ListNode();
        ListNode even =new ListNode();
        ListNode od=odd;
        ListNode ev=even;
        int i=0;

        while(head!=null){
            i++;
            if(i%2!=0){
                od.next=head;
                od=od.next;
            }else{
                ev.next=head;
                ev=ev.next;
            }
            head=head.next;
        }

        od.next=even.next;
        ev.next=null;
        return odd.next;
    }
}