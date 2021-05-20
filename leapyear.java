import java.util.*;
class Test
{
    static boolean checkYear(int year)
    {
    // Return true if year is a multiple
    // of 4 and not multiple of 100.
    // OR year is multiple of 400.
    return (((year % 4 == 0) && (year % 100 != 0)) ||
            (year % 400 == 0));
    }
         
    // Driver method
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
          int year = scan.nextInt();
          System.out.println(checkYear(year)? "Yes" :
                           "No" );
        }
        
    }
}