class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if(n < 4) return false;
        int state = 0;
        boolean inc1 = false;
        boolean dec = false;
        boolean inc2 = false;
        for(int i = 0; i < n - 1; i++) {
            if(nums[i] == nums[i + 1]) return false;
            if(state == 0) { 
                if(nums[i] < nums[i + 1]) {
                    inc1 = true;
                } 
                else {
                    if(!inc1) return false;
                    state = 1;
                    dec = true;
                }

            }
            else if(state == 1) { 
                if(nums[i] > nums[i + 1]) {
                    dec = true;
                } 
                else {
                    if(!dec) return false;
                    state = 2;
                    inc2 = true;
                }

            }
            else { 
                if(nums[i] < nums[i + 1]) {
                    inc2 = true;
                } 
                else {
                    return false;
                }

            }
        }
        return inc1 && dec && inc2;
    }
}
