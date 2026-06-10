class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long maxSum=subarrayMax(nums);
        long minSum=subarrayMin(nums);
        return maxSum-minSum;
    }
    public long subarrayMin(int[] nums){
       int n=nums.length;
       int[] ple=new int[n];
       int[] nle=new int[n];
       long sum=0;
       Stack<Integer> stk=new Stack<>();
       for(int i=0;i<n;i++){
          while(!stk.isEmpty() && nums[stk.peek()]>nums[i]){
              stk.pop();
          }
          ple[i]=stk.isEmpty() ? -1 : stk.peek();
          stk.push(i);
       }
       stk.clear();
       for(int i=n-1;i>=0;i--){
          while(!stk.isEmpty() && nums[stk.peek()]>=nums[i]){
            stk.pop();
          }
          nle[i]=stk.isEmpty() ? n : stk.peek();
          stk.push(i);
       }
       for(int i=0;i<n;i++){
            long left=i-ple[i];
            long right=nle[i]-i;
            sum=sum+(nums[i]*left*right);
        }
        return sum;
    }
    public long subarrayMax(int[] arr){
        int n=arr.length;
        int[] pge=new int[n];
        int[] nge=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] <arr[i]){
                stack.pop();
            }
            pge[i]=stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()] <=arr[i]){
                stack.pop();
            }
            nge[i]=stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        long sum=0;
        for(int i=0;i<n;i++){
            long left=i-pge[i];
            long right=nge[i]-i;
            sum=sum+arr[i]*left*right;
        }
        return sum;
    }
}