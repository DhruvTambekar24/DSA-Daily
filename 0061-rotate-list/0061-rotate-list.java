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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        int i = 1;
        ListNode ptr = head;
        while(ptr.next!=null){
             i++;
             ptr=ptr.next;
        }
        ptr.next=head;
        k=k%i; //i-->size , no extra rotations
        int newHead =i-k;
        ListNode tail=head;
        for(int j=1 ;j<newHead;j++){
            tail=tail.next;
        }
        ListNode newwHead = tail.next;
        tail.next = null;
        return newwHead;
    }
}