class EvenThread extends Thread{
	public EvenThread(String thread_name){
		super(thread_name);
	}
	public void run(){
		System.out.println("Thread name = "+Thread.currentThread().getName());
		for(int i = 0; i<=100; i+=2){
			System.out.print(i+" ");
			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println();
		}
}
class OddThread extends Thread{
	public OddThread(String thread_name){
		super(thread_name);
	}
	public void run(){
		System.out.println("Thread name = "+Thread.currentThread().getName());
		for(int i = 1; i<=100; i+=2){
			System.out.print(i+" ");
			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println();
		}
}
class multithreadingevenodd{
	public static void main(String ...args){
		try{
		EvenThread t1 = new EvenThread("thread-1");
		t1.start();
		t1.join();
		
		OddThread t2 = new OddThread("Thread-2");
		t2.start();
		t2.join();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}