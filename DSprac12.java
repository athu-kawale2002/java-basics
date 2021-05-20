/*Algorithm
STEP 1: SET PTR = HEAD
STEP 2: IF PTR = NULL
   WRITE "EMPTY LIST"
  GOTO STEP 7
  END OF IF

STEP 4: REPEAT STEP 5 AND 6 UNTIL PTR != NULL
STEP 5: PRINT PTR→ DATA
STEP 6: PTR = PTR → NEXT
[END OF LOOP]

STEP 7: EXIT
*/
class DSprac12
{
	Node head;
	static class Node 
	{ 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } // Constructor 
    }
//************************Algorithm starts here  . . . 
	public void printList() 
    { 
        Node n = head; 
        while (n != null) { 
            System.out.print(n.data + " "); 
            n = n.next; 
        } 
    } 
//************************Algorithm ends here   . . .
	public static void main(String ...args)
	{
		DSprac12 l = new DSprac12(); 
  
        l.head = new Node(1); 
        Node second = new Node(2); 
        Node third = new Node(3);
		
		l.head.next = second; 
        second.next = third; 
		
		l.printList(); 
	}
}