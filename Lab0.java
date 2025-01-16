/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

 class set_get
{
    String s1;
    int a1;
   public void setter(String name_of_person,int age_of_person)
    {
       
       s1=name_of_person;
       a1=age_of_person;
    }
   public String get_name()
    {
       return s1;
    }
    public int get_age()
    {
       return a1;
    }
    
}

public class SG
{
	public static void main(String[] args) {
		
		set_get obj=new set_get();
		obj.setter("Student",14);
		System.out.println(obj.get_name()+","+obj.get_age());
	}
}
