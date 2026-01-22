// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] arr = {6,6,1,1,4,4,0,4,5,5,7,7};
        int n = arr.length;
        int count = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(arr[i] ==arr[j]){
                    count +=1;
               }
            }
            if(count ==1){
                System.out.println(arr[i]);
            }
            count = 0;
        }
        
    }
}
