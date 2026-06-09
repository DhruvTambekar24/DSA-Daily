class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        for(int i=0;i<n1;i++){
            int idx=-1;
            int res=-1;
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    idx=j;
                    break;
                }
            }
            for(int k=idx+1;k<n2;k++){
                if(nums2[k]>nums1[i]){
                    res=nums2[k];
                    break;
                }
            }
            nums1[i]=res;
        }
        return nums1;
    }
}