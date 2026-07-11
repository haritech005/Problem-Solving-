/* Structure of doubly linked list node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        
        if(head == null || head.next==null) return head;
        
       Node temp = head;
       Node last = null;
       
       while(temp!=null){
           last = temp.prev;
           temp.prev = temp.next;
           temp.next = last;
           temp = temp.prev;
       }
       
       return last.prev;
       
    }
}
