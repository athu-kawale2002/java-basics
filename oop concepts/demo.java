import java.util.*;
import java.io.*;

public class demo {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while(t-->0){
      int n = scan.nextInt();
      int count = 0;
      for(int i = 0; i<=n; i++){
        if(n%i==0)
          if(i==n || i==1)
            count++;
      }
      if(count==2)
      System.out.println("Yes");
      else
      System.out.println("No");
    }
  }
}