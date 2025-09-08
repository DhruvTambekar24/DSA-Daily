class Solution {
    public int[] getNoZeroIntegers(int n) {
     for(int a=1;a<n;a++){
      int b=n-a;
      if(ok(a) && ok(b)) return new int[]{a,b};
      }
     return new int[0];
 }
 boolean ok(int x){
  while(x>0){
   if(x%10==0) return false;
   x/=10;
  }
  return true;
 }  
}
