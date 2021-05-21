class Cylinder{
	protected int R, H;
	public void setData(int a, int b)
	{
		R = a;
		H = b;
	}
	public void volume()
	{
		double v = Math.PI*R*R*H;
		System.out.println(" The volume of the cylinder is :"+v);
	}
}
class MyCylinder extends Cylinder{
	public void sufaceArea()
	{
		double S = 2 * (Math.PI*R*R) + (2*Math.PI*R) * H;
		System.out.println("The sufaceArea of the cylinder is :"+S);
	}
}
class inheritance14
{
	public static void main(String ...args)
	{
		Cylinder a = new Cylinder();
		a.setData(2,3);
		a.volume();
		
		MyCylinder b = new MyCylinder();
		b.setData(7, 5);
		b.volume();
		b.sufaceArea();
	}
}