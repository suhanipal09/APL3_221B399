/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Offering offering =new Coffee();
	offering = new Rum(offering);
	offering=new Gin(offering);
	System.out.println(offering.getName()+" "+offering.getPrice());
	
	Offering off = new Chai();
	off = new Rum(off);
	off=new Gin(off);
	off=new Icecream(off);
	off = new Rum(off);
	System.out.println(off.getName()+" "+off.getPrice());
	}
}