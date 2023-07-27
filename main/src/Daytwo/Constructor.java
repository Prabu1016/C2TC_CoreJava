package Daytwo;
class Area
{
	Area (int x,int y)
	{
	  int len=x;
	  int width=y;
	  System.out.println("Area1:"+(len*width));
	}
	 Area(int x,int y,int z) 
	{
		System.out.println("Area2:"+(x+y+z));
	}
}
public class Constructor {

	public static void main(String[] args) 
	{
	Area a=new Area(34, 56);
	Area a1=new Area(34, 56,23);  
	}
}
