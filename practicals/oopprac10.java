import java.io.*;
import java.util.*;
class oopprac3
{
	public static void main(String args[])
	{
		try{
			Scanner sc=new Scanner(System.in);
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		Console c=System.console();
		Console p=System.console();
		System.out.print("Enter your name:");
		String name=sc.nextLine();
		System.out.print("Enter the email ID:");
		String email=br.readLine();
		System.out.print("Enter your User ID:");
		String n=c.readLine();
		System.out.print("Enter the Password:");
		char []ch=p.readPassword();
		String pass=String.valueOf(ch);
		System.out.println("****************************");
		System.out.println("Wellcome:"+name);
		System.out.println("Your set Password is:"+pass);
		}
		catch (IOException e) {
        // Do something here
    }
	}
}