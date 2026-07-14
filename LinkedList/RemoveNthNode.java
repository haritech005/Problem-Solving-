// Remove Nth Node From End of List
// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]

static Node RemoveN(Node head, int n){
        Node temp = head;
        int count = 0;

        while(temp!=null){
            count++;
            temp = temp.next;
        }
        if(count==n){
            return head.next;
        }
        int result = count-n;
        temp = head;
        while(temp !=null){
            result--;
            if(result==0){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }

        return head;
    }
