class shape_area
{
  int length,breadth;
  float pi=3.1428f;
  float radius;
  int side;
  void area(float r)
  {
    radius=r;
    float a=pi*radius*radius;
    System.out.println("The area of circle is"+a);
  }
  void area(int l, int b)
  {
    length=l;
    breadth=b;
    int a1=length*breadth;
    System.out.println("The area of rectangle is"+a1);
  }
  void area(int s)
  {
    side=s;
    int a2=side*side;
    System.out.println("The area of square is"+a2);
  }
  public static void main(String args[])
  {
    shape_area c1 = new shape_area();
    c1.area(6.0f);
    shape_area c2 = new shape_area();
    c2.area(6,5);
    shape_area c3 = new shape_area();
    c3.area(5);
  }
  }