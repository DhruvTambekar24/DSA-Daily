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
        int cnt1=0;
        int cnt2=0;
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null){
            cnt1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            cnt2++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;
        if (cnt1>cnt2) {
          for(int i=0;i<cnt1-cnt2;i++)temp1 = temp1.next;
        } else {
        for(int i=0;i<cnt2-cnt1;i++)temp2=temp2.next;
        }
        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
}