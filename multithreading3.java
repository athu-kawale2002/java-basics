class MyThread extends Thread{
	public MyThread(String thread_name){
		super(thread_name);
	}
	public void run(){
		System.out.println("Thread name = "+Thread.currentThread().getName());
		for(int i = 0; i<=100; i++){
			System.out.print(i+" ");
			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class multithreading3{
	public static void main(String ...args){
		System.out.println("Thread Name = "+Thread.currentThread().getName());
		MyThread mt = new MyThread("Thread_name");
		mt.start();
		
		MyThread mt1 = new MyThread("Thread2_name");
		mt1.start();
	}
}