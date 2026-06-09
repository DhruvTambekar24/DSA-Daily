class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res = new int[n];
        Arrays.fill(res,-1);
        Stack<Integer> stk=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int num=nums[i%n];
            while(!stk.isEmpty() && stk.peek()<=num){
                stk.pop();
            }
            if(i<n){
                if(!stk.isEmpty()){
                    res[i]=stk.peek();
                }
            }
            stk.push(num);
        }
        return res;
    }
}