import java.io.*;
class file_hnadling_1{
	public static void main(String ...args){
		File f = new File("E:/google_class_room");
		if(f.exists())
		System.out.println("zali re baa");
		else
		System.out.println("naii zali re baa");
	}
}