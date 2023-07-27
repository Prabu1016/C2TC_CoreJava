package Dayone;

class operation
{
public void add()
{
	int x=23;
	int y=90;
	System.out.println("Addition:"+(x+y));
}
public int sub(int x,int y)
{
	return x-y;
}
public int mul(int x,int y)
{
	return x*y;
}
public void div(int x,int y)
{
	System.out.println("Division:"+(x/y));
}

}
class Arithmetic
{
	public static void main (String []args)
	{
		operation j=new operation();
		j.add();
		System.out.println("Subtraction:"+j.sub(56, 43));
		System.out.println("Multiplication:"+j.mul(89, 90));
		j.div(90, 10);
	}
}
