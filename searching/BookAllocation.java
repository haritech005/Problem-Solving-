/*Given an array nums of n integers, where nums[i] represents the number of pages in the i-th book, and an integer m representing the number of students, allocate all the books to the students so that each student gets at least one book, each book is allocated to only one student, and the allocation is contiguous.



Allocate the books to m students in such a way that the maximum number of pages assigned to a student is minimized. If the allocation of books is not possible, return -1.


Example 1

Input: nums = [12, 34, 67, 90], m=2

Output: 113

Explanation: The allocation of books will be 12, 34, 67 | 90. One student will get the first 3 books and the other will get the last one*/

public class BookAllocation {
    static void main(String[] args) {
        int[] arr = {25, 46, 28, 49, 24};
        int students = 4;
        System.out.println(findPages(arr, students));
    }
    public static int possiblePages(int[] arr, int pages){
        int student = 1;
        int pagesStudent = 0;

        for(int i=0;i<arr.length;i++){
            if(pagesStudent+arr[i] <=pages){
                pagesStudent+=arr[i];
            }
            else{
                student++;
                pagesStudent = arr[i];
            }
        }

        return student;
    }
    public static int maxValue(int[] arr){
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            ans = Math.max(ans,arr[i]);
        }
        return ans;
    }

    public static int sumValue(int[] arr){
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans += arr[i];
        }
        return ans;
    }
    public static int findPages(int[] arr, int pages){
        int low = maxValue(arr);
        int high = sumValue(arr);
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(possiblePages(arr,mid) <= pages){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
