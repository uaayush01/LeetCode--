/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }

    //step1:set new node between every nodes;

    Node curr=head;

    while(curr!=null){
        Node newNode=new Node (curr.val);
        newNode.next=curr.next;
        curr.next=newNode;
        curr=newNode.next;
    }
    
        // step2: assign random pointer for the copied nodes
        curr=head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }
            curr=curr.next.next;
        }

    // step3: separate the original and copied lists

    curr=head;
    Node newHead=head.next;
    Node currCopy = newHead;

    while(curr!=null){
        curr.next=curr.next.next;

        if(currCopy.next!=null){
            currCopy.next=currCopy.next.next;
        }
        curr=curr.next;
        currCopy=currCopy.next;
    }
    return newHead;
    }
}