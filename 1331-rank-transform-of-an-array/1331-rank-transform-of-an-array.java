class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] arr1=arr.clone();
        Arrays.sort(arr1);
        int j=0;
        for(int i=0;i<n;++i){
            if(i==0 || arr1[i]!=arr1[i-1]){
                arr1[j++]=arr1[i];
            }
        }
        int[] res=new int[n];
        for(int i=0;i<n;++i){
            res[i]=Arrays.binarySearch(arr1,0,j,arr[i])+1;
        }
        return res;
    }
}