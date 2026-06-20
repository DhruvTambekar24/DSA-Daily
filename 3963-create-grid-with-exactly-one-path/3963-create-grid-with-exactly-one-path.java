class Solution {
    public String[] createGrid(int m, int n) {
        char[][] arr=new char[m][n];
        arr[0][0]='.';
        arr[0][n-1]='.';
        for(int i=0;i<m;i++){
            Arrays.fill(arr[i],'#');
        }
        for(int i=0;i<n;i++){
            arr[0][i]='.';
        }
        for(int i=0;i<m;i++){
            arr[i][n-1]='.';
        }
        List<String> res=new ArrayList<>();
        for(int i=0;i<m;i++){
            res.add(new String(arr[i]));
        }
        return res.toArray(new String[0]);
    }
}