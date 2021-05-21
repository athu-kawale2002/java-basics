class MyThread extends Thread
{
	public MyThread(String thread_name){
		super(thread_name);
	}
	public void run(){
		System.out.println("Thread Name = "+Thread.currentThread().getName());
		for(int i = 0; i<=100; i++){
			System.out.print(i+" ");
			try{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
class mutlithreading2{
	public static void main(String ...args){
		System.out.println("Thread Name = "+Thread.currentThread().getName());
		MyThread t1 = new MyThread("Thread-1boom");
		t1.start();
		
		MyThread t2 = new MyThread("Thread-2boom");
		t2.start();
	}
}