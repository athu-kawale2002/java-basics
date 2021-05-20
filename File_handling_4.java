import java.io.*;
class File_handling_4{
	public static void main(String ...args){
		try{
			File f1 = new File("C:/Users/MSI/OneDrive/Desktop/txt files/Abyas.txt");
			//File f2 = new File("C:/Users/MSI/OneDrive/Desktop/txt files/output.txt");
			if(f1.exists()){
				FileInputStream fin = new FileInputStream(f1);
				//here down you can give f2 in place of address of new file.
				FileOutputStream fout = new FileOutputStream("C:/Users/MSI/OneDrive/Desktop/txt files/output.txt");
				while(true){
					int ch = fin.read();
					if(ch == -1)
					break;
					else
					fout.write(ch);
				}
			}
			else
			System.out.println("File does not found..........");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}