class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> majority = new ArrayList<>();

        int cnt1 = 0, cnt2 = 0;
        Integer ele1 = null, ele2 = null;
        for (int num : nums) {
            if (ele1 != null && num == ele1) {
                cnt1++;
            } else if (ele2 != null && num == ele2) {
                cnt2++;
            } else if (cnt1 == 0) {
                ele1 = num;
                cnt1 = 1;
            } else if (cnt2 == 0) {
                ele2 = num;
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int num : nums) {
            if (ele1 != null && num == ele1) cnt1++;
            if (ele2 != null && num == ele2) cnt2++;
        }
        if (cnt1 > n / 3) majority.add(ele1);
        if (ele2 != null && !ele2.equals(ele1) && cnt2 > n / 3) majority.add(ele2);

        return majority;
    }
}
