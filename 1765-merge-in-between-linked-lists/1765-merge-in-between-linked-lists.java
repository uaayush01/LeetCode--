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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1==null){
            return null;
        }
        ListNode curr =list1;
        ListNode prev=null;
        int counter=0;
         while(counter!=a){
            prev=curr;
            curr=curr.next;
            counter++;
         }
         ListNode temp=prev;
        ListNode newCurr=curr;
        while(counter!=b){
            curr=curr.next;
            counter++;
        }
         ListNode newTemp=curr.next;

         temp.next=list2;
         ListNode secondCurr=list2;
         while(secondCurr.next!=null){
            secondCurr=secondCurr.next;
         }
         secondCurr.next=newTemp;

         return list1;

    }
}