import java.util.*;
import java.io.*;

public class prepbytes {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while(t-->0){
      int s = 0;
      int n = scan.nextInt();
      for(int i = 0; i<=100; i++){
        if(n%i==0)
        s = s+i;
      }
      System.out.println(s);
      if(s==n)
      System.out.println("true");
      else
      System.out.println("false");
    }
    
  }
}