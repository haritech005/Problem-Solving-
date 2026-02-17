//Selection Sorting
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
       int[] arr = {64, 25, 12, 22, 11};

       for(int i=0;i<arr.length-1;i++){
        int min = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
                min = j;
            }
        }
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
       }
       System.out.println(Arrays.toString(arr));
    }
}

//Selection Sort

import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,7};

        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

    System.out.println(Arrays.toString(arr));
    }
}
