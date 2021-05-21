import java.util.*;
class StringNotSameException extends Exception{
	public StringNotSameException(String msg)
	{
		super(msg);
	}
}
class throwstatement1{
	public static void main(String ...args){
		try{
			Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		String y = scan.nextLine();
		if(x.equals(y))
		System.out.println("They are equal");
		else
		{
			StringNotSameException e = new StringNotSameException("Strings are not same");
			throw e;
		}
		}
		catch(StringNotSameException e){
			e.printStackTrace();
		}
	}
}