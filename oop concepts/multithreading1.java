class MyFrame extends Thread
{
	public void run(){
		for(int i = 0; i<=1000; i++){
			System.out.print("*");
		}
	}
}
class multithreading1{
	public static void main(String ...args){
		MyFrame mt = new MyFrame();
		mt.start();
		
		for(int i = 0; i<=1000; i++){
			System.out.print("#");
		}
	}
}