import java.util.Scanner;
class fastpatternmatching
{
  public static void main(String args[])
  {
    int j=0,c=0;
    Scanner stdin=new Scanner(System.in);
    System.out.println("Enter a string");
    String str1=stdin.nextLine();
    System.out.println("Enter a pattern");
    String str2=stdin.nextLine();
    for(int i=0;i<str1.length();i++)
    {
      if(str1.charAt(i)==str2.charAt(j))
      {
	int k=i;
        c=0;
	for(int g=0;g<str2.length();g++,k++)
          if(str1.charAt(k)==str2.charAt(g))
             c+=1;
        if(str2.length()==c)
        {
	  System.out.println("Matched at "+i);
          break;
        }   
      }
    }
      if(str2.length()!=c)
        {
	  System.out.println("No Match found");
        }  
  }
}