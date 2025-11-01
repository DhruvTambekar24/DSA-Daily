class Solution {
    public ListNode removeElements(ListNode head, int val) {
        int i = val;
        if(head==null){
            return head;
        }
         while(head != null && head.val == i){
            head = head.next;
        }
        if(head == null) return null;
        ListNode p = head;
        ListNode q = head.next;
        while(q!=null){
          if(q.val==i){
            p.next=q.next;
            q=q.next;
          }
          else{
            p=q;
            q=q.next;
          }
        }
        return head;
    }
}