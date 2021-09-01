import java.lang.*;
class rect1{
    private double length;
    private double breadth;
    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public void setLength(double l)
    { 
      if(length>=0)
      {
          length=l;
      }
      else{
          length=0;
      }
    }
    public void setBreadth(double b)
    {
        if(breadth>=0)
        {
            breadth=b;
        }
        else{
            breadth=0;
        }
    }
    public double area()
    {
        return getLength()*getBreadth();
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
}
class rect2{
    public static void main(String[] args)
    {
        rect1 r=new rect1();
        r.setLength(5.8);
        r.setBreadth(4.4);
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}