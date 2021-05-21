import java.io.*;
class File_handling_7{
	public static void main(String ...args){
		try{
			FileInputStream fin = new FileInputStream("C:/Users/MSI/OneDrive/Desktop/txt files/FileOutputStream.dat");
			DataInputStream din = new DataInputStream(fin);
			int s = 0;
		for(int i = 1; i<=5; i++){
			int n = din.readInt();
			System.out.println("n = "+n);
			s = s+n;
		}
		din.close();
		fin.close();
		  double m = s/5.0;
		  System.out.println("Sum is : "+s);
		  System.out.println("Mean is : "+m);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}