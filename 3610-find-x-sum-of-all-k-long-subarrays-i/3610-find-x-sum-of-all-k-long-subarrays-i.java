class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int res[] = new int[n - k + 1];
        for(int i = 0; i <= n - k; i++){
            int freq[] = new int[51]; 
            for(int j = i; j < i + k; j++) {
                freq[nums[j]]++;
            }
            int val[][] = new int[51][2];
            for(int a = 1; a <= 50; a++){
                val[a][0] = a;
                val[a][1] = freq[a];
            }
            Arrays.sort(val, new Comparator<int[]>() {
                public int compare(int[] p1, int[] p2) {
                    if (p2[1] != p1[1]) {
                        return p2[1] - p1[1];
                    } else {
                        return p2[0] - p1[0]; 
                    }
                }
            });
            int sum = 0;
            int count = 0;
            for(int b = 0; b < 51 && count < x; b++) {
                if(val[b][1] > 0) {
                    sum += val[b][0] * val[b][1];
                    count++;
                }
            }
            res[i] = sum;
        }
        return res;
    }
}