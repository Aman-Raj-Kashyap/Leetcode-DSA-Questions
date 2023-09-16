class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0,high=m*n-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            int row=mid/n;
            int col=mid%n;
            
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
        
        /*O(m*log(n))
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        
        for(int i=0;i<=m;i++){
            int low=0,high=n;
            if(target>=matrix[i][low] && target<=matrix[i][high]){
                while(low<=high){
                    int mid=low+high/2;
                    if(target==matrix[i][mid])
                        return true;
                    else if(target>matrix[i][mid]) low=mid+1;
                    else high=mid-1;
                }
            }
        }
        return false;*/
        
        
        /* O(m*n)
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target)
                    return true;
            }
        }
        return false;*/
    }
}