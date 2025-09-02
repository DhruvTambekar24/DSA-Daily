class Solution {
    public int numberOfPairs(int[][] points) {
      int n = points.length;
      int m = points[0].length;
      int ct=0; 
      for(int i=0;i<n;i++){
        int[] arr = points[i];
        for(int j=0;j<n;j++){
            if(i==j) continue;
            int[] arr1 = points[j];
            if(arr[0] <= arr1[0] && arr[1] >= arr1[1]){
            boolean isValid = true;
            for(int k=0;k<n;k++){
                if(k==i||k==j) continue;
                int[] arr2=points[k];
                if (arr2[0] >= arr[0] && arr2[0] <= arr1[0] && arr2[1] <= arr[1] && arr2[1] >= arr1[1]) {
                            isValid = false;
                            break;
                        }
            }
            if(isValid){
                ct++;
            }
            }
        }
      }
      return ct;
    }
}