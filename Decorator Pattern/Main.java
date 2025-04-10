
public class Main
{
	public static void main(String[] args) {
	    Offering offering=new Coffee(); 
	    Offering offering1=new Icecream(); 
	    offering =new Rum(offering);
	    offering1 =new Rum(offering1);
	    offering1 =new Rum(offering1);
	    offering1 =new Rum(offering1); 
		System.out.println(offering.getName()+" "+offering.getValue());
		System.out.println(offering1.getName()+" "+offering1.getValue());
	}
}