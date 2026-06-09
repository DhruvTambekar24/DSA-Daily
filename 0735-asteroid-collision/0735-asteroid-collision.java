class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk=new Stack<>();
        int n=asteroids.length;
        for(int i=0;i<n;i++){
            if(asteroids[i]>0){
                stk.push(asteroids[i]);
            }else{
                boolean done=false;
                while(!stk.isEmpty() && stk.peek()>0 && stk.peek()<Math.abs(asteroids[i])){
                    stk.pop();
                }
                if(!stk.isEmpty() && stk.peek()>0){
                    if(stk.peek()==Math.abs(asteroids[i])) {
                        stk.pop();
                    }
                    done=true;
                }
                if(!done){
                    stk.push(asteroids[i]);
                }
            }
        }
        int[] res=new int[stk.size()];
        for(int i=stk.size()-1;i>=0;i--){
            res[i]=stk.pop();
        }
        return res;
    }
}