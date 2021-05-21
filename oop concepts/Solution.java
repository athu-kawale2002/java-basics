import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
		sc.nextLine();
		System.out.println("Input Selectied q: "+q);
        for(int i=1; i<=q; i++)
        {
            int n = sc.nextInt();
			String b = n+" ";
            list.add(b);
        }
		System.out.println("end of for loop");
        int p = sc.nextInt();
		sc.nextLine();
		System.out.println("Input selected p: "+p);
        for(int j=1; j<=p; j++)
        {
            String m = sc.nextLine();
			System.out.println("Insert or delete is intputed sucessfullyu: "+m);
			String s1 = "Insert";
			String s2 = "Delete";
            try{
			if(m.equals(s1))
            {
                int a = sc.nextInt();
                String b = sc.nextLine();
                list.add(a, b); 
				System.out.println("Elements added to the list");
            }
            if(m.equals(s2))
            {
                int c = sc.nextInt();
                list.remove(c);
				System.out.println("The Element is removed from the list");
            }
			}
			catch(Exception e){
				e.printStackTrace();
			}
        }
    }
}