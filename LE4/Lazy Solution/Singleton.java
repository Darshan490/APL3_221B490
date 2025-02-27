

public class Singleton
{
    
	public static Singleton uniqueInstance;
	private Singleton(){}
	public static Singleton getInstance()
	{
	    if(uniqueInstance==null)   //This is lazy approach for single threaded environment 
	    {
	        uniqueInstance=new Singleton();
	    }
	    return uniqueInstance;
	}
}