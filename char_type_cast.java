class char_type_cast{
	public static void main(String ...args){
		char c1 = (char)-122;
		System.out.println("Type casted char :"+c1);
		char c2 = '\u0122';
		char c3 = 122;
		System.out.println("unicode char : "+c2+"normal char :"+c3);
	}
}