package Day3;
//Multilevel Inheritance
class grandfather
{
    public void land()
    {
        System.out.println("Grand father has 13 land.");
    }
}
class father extends grandfather
{
    public void house()
    {
        System.out.println("Father has house.");
    }
}
class son extends father
{
    public void car()
    {
        System.out.println("Son has own car.");
    }
}

public class Multilevel_Inheritance 
{
	public static void main(String[] args)
	{	
      son s=new son();
      s.land();
      s.house();
      s.car();
	}

}
