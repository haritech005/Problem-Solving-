//Brute

public class RotateMatrix90 {
    static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n= matrix.length;

        int[][] rotated = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-i-1] = matrix[i][j];
            }
        }

        for (int[] row : rotated) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

    }
}


//Optimal

public class RotateMatrix90Optimal {
    static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            int left = 0;
            int right = n-1;

            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
