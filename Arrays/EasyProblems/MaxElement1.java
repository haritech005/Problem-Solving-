//Bruteforce solution for Finding maximum element in an array

class Main {
    public static void main(String[] args) {
       int [] arr = {3,2,1,5,2,4};
       int max = arr[0];
       for(int i=1;i<=arr.length-1;i++){
        if(arr[i]>max){
            max = arr[i];
        }
       }
       System.out.println("The maximum value of the array is "+max);
    }
}
