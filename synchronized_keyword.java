class MyPrint implements Runnable{
	public synchronized void run(){
		for(int i = 0; i<=10; i++){
			System.out.print(i+" ");
			try{
				Thread.sleep(400);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class synchronized_keyword{
	public static void main(String ...args){
		MyPrint mp = new MyPrint();
		
		Thread t1 = new Thread(mp);
		t1.start();
		
		Thread t2 = new Thread(mp);
		t2.start();
	}
}