//searching in linked list . . .
/*Algorithm
Step 1: SET PTR = HEAD
Step 2: Set I = 0
STEP 3: IF PTR = NULL
  WRITE "EMPTY LIST"
  GOTO STEP 8
  END OF IF

STEP 4: REPEAT STEP 5 TO 7 UNTIL PTR != NULL
STEP 5: if ptr → data = item
  write i+1
 End of IF

STEP 6: I = I + 1
STEP 7: PTR = PTR → NEXT
[END OF LOOP]

STEP 8: EXIT*/
import java.util.LinkedList;
class DSprac12c{
	public static void main(String ...args)
	{
        LinkedList<Integer> ll = new LinkedList<>(); 
        ll.add(1); 
        ll.add(2); 
        ll.add(3); 
        ll.add(4); 
        ll.add(5); 
        ll.add(6); 
        ll.add(7); 

        int element = 4; 
        int ans = -1; 
        for (int i = 0; i < ll.size(); i++) { 
            int llElement = ll.get(i); 
            if (llElement == element) {  
                ans = i; 
                break; 
            } 
        } 
        if (ans == -1) { 
            System.out.println("Element not found"); 
        } 
        else { 
            System.out.println( 
                "Element found in Linked List at " + ans); 
        } 
	}
}