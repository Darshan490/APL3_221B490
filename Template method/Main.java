

public class Main
{
	public static void main(String[] args) {
	    Beverage b=new Whisky();
	    b.templateMethod(30);
		System.out.println("");
		b= new Beer();
		 b.templateMethod(200);
	}
}