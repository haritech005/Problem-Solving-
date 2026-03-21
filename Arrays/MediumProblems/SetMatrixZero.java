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


    //Optimal

    public class SetMatrixZeroOptimal {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        boolean firstRowZero = false;
        boolean firstColumnZero = false;

        int m = matrix.length;
        int n = matrix[0].length;

        //step 1 : first row/col markers
        for(int j=0;j<n;j++){
            if(matrix[0][j] ==0){
                firstRowZero=true;
                break;
            }
        }

        for(int i=0;i<m;i++){
            if(matrix[i][0] ==0){
                firstColumnZero = true;
                break;
            }
        }

        // step 2 : Mark row/column using first row/col
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] ==0){
                    matrix[0][j] =0;
                    matrix[i][0] =0;
                }
            }
        }

        //step 3 : Update based on markers
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[0][j] ==0 || matrix[i][0]==0){
                    matrix[i][j] =0;
                }
            }
        }

        // step 4 : fix first row
        if(firstRowZero){
            for(int j=0;j<n;j++){
                matrix[0][j] =0;
            }
        }

        //step 5 : fix first column
        if(firstColumnZero){
            for(int i=0;i<m;i++){
                matrix[i][0] =0;
            }
        }

        //printing the values
        for(int[] data : matrix){
            for(int res : data){
                System.out.print(res);
            }
            System.out.println();
        }

    }
}

}
  
}
