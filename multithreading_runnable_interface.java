class EvenNumber extends Thread{
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
class OddNumber extends Thread{
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
class multithreading_runnable_interface{
	public static void main(String ...args){
		try{
		EvenNumber en = new EvenNumber();
		Thread t1 = new Thread(en);
		t1.start();
		t1.join();
		
		OddNumber on = new OddNumber();
		Thread t2 = new Thread(on);
		t2.start();
		t2.join();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}