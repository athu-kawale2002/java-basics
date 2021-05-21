import java.io.*;
class File_handling_3{
	public static void main(String ...args){
	try{
		File f = new File("C:/Users/MSI/OneDrive/Desktop/txt files/javanotes322.txt");
		if(f.exists()){
			FileInputStream fin = new FileInputStream(f);
			while(true){
				int ch = fin.read();
				if(ch == -1)
				break;
				else
				System.out.print((char)ch);				
			}
		}
		else
		System.out.println("File not found........");
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}
}