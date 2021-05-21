import java.io.*;
class File_handling_6{
	public static void main(String ...args){
	try{
		int arr[] = {10, 20, 30, 40, 50};
		FileOutputStream fout = new FileOutputStream("C:/Users/MSI/OneDrive/Desktop/txt files/FileOutputStream.dat");
		DataOutputStream dout = new DataOutputStream(fout);
		
		for(int i = 0; i<arr.length; i++)
			dout.writeInt(arr[i]);
			
			dout.close();
			fout.close();
			
			System.out.println("Numbers saved . . . . ");
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}
}