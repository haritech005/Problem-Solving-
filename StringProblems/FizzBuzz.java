class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = i + 1;
            arr.add(String.valueOf(num));

            if (num % 3 == 0 && num % 5 == 0) {
                arr.set(num-1,"FizzBuzz");
            }

            else if (num % 3 == 0) {
                arr.set(num-1,"Fizz");
            }

            else if (num % 5 == 0) {
                arr.set(num-1,"Buzz");
            }
        }

        return arr;
    }
}
