class Solution {
    public void rotate(int[][] matrix) {
        //First transpose and then reverse each rows
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
        
        /*Brute
        int n=matrix.length;
        
        int[][] result=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result[j][n-1-i]=matrix[i][j];
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=result[i][j];
            }
        }*/
    }
}