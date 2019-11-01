package pizzadetail;

import storeaddress.PizzaAddress;

public class MyPizza extends OrganicPizza implements PizzaSize, PizzaAddress {
   
	
	public void CustPizza() {
		System.out.println("Welcome to our Pizza Store");
		System.out.println("We can make Custom Pizza for you");	
	}
	
	@Override
	public void OrPizza() {
		
		System.out.println("We can make Organic Pizza for You");
		System.out.println( "\n");
	}
	@Override
	public void smallPizza() {
		System.out.println("Small Pizza is good for 2 Persons");
	}
	@Override
	public void mediumPizza() {
		System.out.println("Medium Pizza is good for 4 Persons");
	}
	@Override
	public void largePizza() {
		System.out.println("Large Pizza is good for 6 Persons");
	}
	
	@Override
	public void storeAddrss() {
		System.out.println( "\n");
		System.out.println( "PNT Pizza");
		System.out.println( "128 Asdtoria , NY-20115");
		
	}
	@Override
	public void storePhone() {
		System.out.println( "Phone :128-336-9866");
		System.out.println( "\n");
	}
	
   
	
}
