package testpizza;
import pizzadetail.MyPizza;
import pizzaprice.PizzaCost;


public class TestPizza {
	public static void main(String[] args) {	
	
		
	MyPizza m1=new MyPizza();
	
	m1.storeAddrss();
	m1.storePhone();
	m1.CustPizza();
	m1.OrPizza();
	m1.smallPizza();
	m1.mediumPizza();		
	m1.largePizza();
//	PizzaCost n1= new PizzaCost();
	//c1.nameInput();
	//System.out.println( "\n");
	PizzaCost c1= new PizzaCost(10,12,15);	
	c1.nameInput();
	c1.costDisplay();
   
	}
}
