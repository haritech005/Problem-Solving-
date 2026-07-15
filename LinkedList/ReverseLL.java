static Node ReverseBrute(Node head){
       Node temp = head;
       Stack<Integer> st = new Stack<>();

       while(temp!=null){
           st.push(temp.data);
           temp = temp.next;
       }

       temp = head;
       while (temp!=null){
           temp.data = st.pop();
           temp = temp.next;
       }

       return head;
    }


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }
}
