// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MaxValue {
    public static void main(String[] args) {
        int[] arr = {3,3,6,1,8,3,5};
        int max = arr[0];
       for(int i=0;i<=arr.length-1;i++){
          if(arr[i]>max){
              max = arr[i];
          }
       }
        System.out.println(max);
    }
}
