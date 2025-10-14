// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        int[] arr = {1,2,2,3};
        int low = 0;
        int high = arr.length-1;
        int index = -1;
        int x= 31;
        
        while(low<high){
            int mid = low+high/2;
            if(arr[mid]>=x){
                index = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(index);
    }
}
