package deadpool;
class Time{
	private int H, M;
	public Time(int a, int b){
		H = a;
		M = b;
	}
	public void showData(){
		System.out.println("The time is :"+H+"Hours"+M+"Minutes");
	}
	public int convert(){
		int  Z = H*60+M;
		System.out.println("The total distance is :"+Z);
	}
}