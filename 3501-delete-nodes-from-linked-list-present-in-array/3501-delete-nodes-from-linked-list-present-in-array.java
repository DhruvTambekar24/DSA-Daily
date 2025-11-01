class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        int n = nums.length;
        if (n == 0 || head == null) {
            return head;
        }
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            s.add(nums[i]);
        }
        while (head != null && s.contains(head.val)) {
            head = head.next;
        }
        if (head == null) return null;
        ListNode p = head;
        ListNode q = head.next;
        while (q != null) {
            if (s.contains(q.val)) {
                p.next = q.next;
                q = q.next;
            } else {
                p = q;
                q = q.next;
            }
        }
        return head;
    }
}
