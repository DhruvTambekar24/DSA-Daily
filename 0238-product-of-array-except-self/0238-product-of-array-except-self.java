class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] answer=new int[n];
        int prev=1;
        for(int i=0;i<n;i++){

            answer[i]=prev;
            prev=prev*nums[i];
        }
        int next=1;
        for(int i=n-1;i>=0;i--){
            answer[i]=answer[i]*next;
            next=next*nums[i];
        }
        return answer;
    }
}