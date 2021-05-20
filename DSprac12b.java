//Delete a last node of the linked list.
/*Algorithm
Step 1: IF HEAD = NULL
Write UNDERFLOW
   Go to Step 8
  [END OF IF]

Step 2: SET PTR = HEAD
Step 3: Repeat Steps 4 and 5 while PTR -> NEXT!= NULL
Step 4: SET PREPTR = PTR
Step 5: SET PTR = PTR -> NEXT
[END OF LOOP]

Step 6: SET PREPTR -> NEXT = NULL
Step 7: FREE PTR
Step 8: EXIT*/
class DSprac12b
{ 
    static class Node { 
        int data; 
        Node next; 
    }; 
//********************************Algorithm starts here . . .
    static Node removeLastNode(Node head) 
    { 
        if (head == null) 
            return null; 
  
        if (head.next == null) { 
            return null; 
        }
        Node second_last = head; 
        while (second_last.next.next != null) 
            second_last = second_last.next; 
        second_last.next = null; 
  
        return head; 
    }
    static Node push(Node head_ref, int new_data) 
    { 
        Node new_node = new Node(); 
        new_node.data = new_data; 
        new_node.next = (head_ref); 
        (head_ref) = new_node; 
        return head_ref; 
    } 
//********************************Algorithm ends here . . .
 
    public static void main(String args[]) 
    { 
        Node head = null; 
		head = push(head, 12); 
        head = push(head, 29); 
        head = push(head, 11); 
        head = push(head, 23); 
        head = push(head, 8); 
  
        head = removeLastNode(head); 
        for (Node temp = head; temp != null; temp = temp.next) 
            System.out.print(temp.data + " "); 
    } 
} 