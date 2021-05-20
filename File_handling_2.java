import java.io.*;
class File_handling_2{
	public static void main(String ...args)
	{
		File f = new File("C:/Users/MSI/OneDrive/Desktop/txt files/Abyas.txt");
		if(f.exists())
		System.out.println("Path Exists ***********");
		else 
		System.out.println("Path does not exists ****************");
	}
}