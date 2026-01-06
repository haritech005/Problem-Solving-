//To find second largest element in an array

// bruteforce -> find max and give another reverse loop for checking second largest

//better solution 

class Main {
    public static void main(String[] args) {

       int[] arr = {1,2,4,7,7,5};
       int max = arr[0];
       int secMax = arr[0];

       for(int i=0;i<=arr.length-1;i++){
        if(arr[i]>max){
            max = arr[i];
        }
       }

        for(int j=0;j<=arr.length-1;j++){

            if (arr[j]>secMax && arr[j]!=max){
                secMax = arr[j];
            }
        }

        System.out.println(secMax);

    }
}


// Optimial solution 
class Main {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                secMax = max;
                max = arr[i];
            }
            else if (arr[i] > secMax && arr[i] < max) {
                secMax = arr[i];
            }
        }
        System.out.println(secMax);

    }
}
