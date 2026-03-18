// Brute force method

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int m = matrix.length;
        int n = matrix[0].length;
        
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(matrix[i][j] == 0){
                   
                   for(int col=0;col<n;col++){
                       if(matrix[i][col] !=0){
                           matrix[i][col] =-1;
                       }
                   }
                   
                   for(int row=0;row<m;row++){
                       if(matrix[row][j] !=0){
                           matrix[row][j] =-1;
                       }
                   }
                   
               }
           }
       }
       
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(matrix[i][j] ==-1){
                   matrix[i][j] =0;
               }
           }
       }
       
       for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
       
    }


// better

  // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int m = matrix.length;
        int n = matrix[0].length;
        
       boolean[] row = new boolean[m];
       boolean[] col = new boolean[n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] ==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i] || col[j]){
                     matrix[i][j] =0;
                }
            }
        }
        
            for (int[] data : matrix) {
            for (int val : data) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
  
}
