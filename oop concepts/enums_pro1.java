enum day{
	MONDAY,
	TUESDAY,
	WESNESDAY,
	THRUSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}
class enums_pro1
{
	public static void main(String ...args){
		for(day Days : day.values()){
			System.out.println(Days);
		}
	}
}