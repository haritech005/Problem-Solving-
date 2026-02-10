class Main {
    public static void main(String[] args) {
       int[] arr = {1,1,2,3,2,1,2};
       int[] hash = new int [10];
       
       for(int i=0;i<arr.length; i++){
           hash[arr[i]]++;
       }
       System.out.println(hash[2]);
    }
}
