
class Solution {
    public int diagonalSum(int[][] mat) {
         int sum=0,j=mat.length-1;
        for(int i=0;i<mat.length;i++)
        {
            sum+=mat[i][i]+mat[i][j--];
        }
        if(mat.length%2==1){
            sum-=mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}

//faster approach

class Solution {
    public int diagonalSum(int[][] mat) {
       int n = mat.length;
        
        int i = 0;
        int j = 0;
        int ans = 0;
        
        while(i<n){      // for first digonal
            ans += mat[i][j];
            i++;
            j++;
        }
        
        int row = 0;
        int col = n - 1;
        
        while(row < n){     // for second digonal
            if(row != col){          // this condition is to prevent addition if row and column overlaps
                ans+= mat[row][col];
            }
            
            row++;
            col--;
        }
        
        return ans;
    }
}


