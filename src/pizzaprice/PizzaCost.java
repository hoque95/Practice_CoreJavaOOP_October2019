package pizzaprice;

//import java.nio.channels.SelectableChannel;

import java.util.Scanner;

public class PizzaCost {
	
  String name;

  
 int small, medium,large;
//Constructor
 public PizzaCost(int s, int m,int l) {
	small=s;
	medium=m;
	large=l;
	
 }
 public void nameInput() {
		
		Scanner input=new Scanner(System.in);
		System.out.print("\n");
		System.out.print("Enter your Name:"+name);
		name=input.nextLine();
		System.out.println("Followings is the menu wtih price "+name);
		System.out.println("\n");
 } 
  
	public void costDisplay() {
		System.out.println("Our everyday regular nemu:-");
		System.out.println( "              a.Small size Pizza  :$"+small);
		System.out.println( "              b.Medium size Pizza :$"+medium);
		System.out.println( "              c.Large size Pizza  :$"+large);
	}
	

		
		
		
}

