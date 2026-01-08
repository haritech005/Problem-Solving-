class Main {
    public static void main(String[] args) {
       int[] arr = {1,1,3,3,4,4,5,5,5,6,6,9};

        int i =0;
       for(int j=1;j<arr.length;j++){
        if(arr[j]!=arr[i]){
            arr[i+1] = arr[j];
            i++;
        }
       }
       for(int k=0;k<=i;k++){
        System.out.println(arr[k]);
       }
    }
}
