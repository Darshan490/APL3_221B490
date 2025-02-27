

public class Singleton_E
{
    
	public static Singleton_E uniqueInstance=new Singleton_E();  //This is eager solution for multi threaded environment
	private Singleton_E(){}
	public static Singleton_E getInstance()
	{
	   return uniqueInstance;
	}
}