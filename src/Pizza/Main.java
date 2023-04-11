package Pizza;
import java.util.*;
public class Main {
	
	// Display all the pizza of Hungry and Hungry Brust
	public static void displayPizza(Boolean isVeg) {
		System.out.println("Select the Pizza from the Menu:");
		System.out.println("=======================================");
		Hungry obj = new Hungry();
		obj.Menu(isVeg);
		HungryBrust obj1 = new HungryBrust();
		obj1.selectPizza(isVeg);
	}

	// Main Method1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Veg vs Non-Veg
		System.out.println("Select the Size\n1.Veg\t2.Non-Veg");
		boolean isVeg = (sc.nextInt()==1)?true:false;
		
		// Storage 
		products pizza = new products();
		products crust = new products();
		products drinks = new products();
		products addsOn = new products();
		products topping = new products();
		
		// Type of Crust
		displayPizza(isVeg);
		System.out.println("Select your Hunger\n1. Hungry\t2. Hungry Brust");
		int typeHungry = sc.nextInt();
		
		//Hungry Section
		if(typeHungry==1) {
			Hungry hun = new Hungry();
			pizza = hun.selectPizza(isVeg);
			crust = hun.crustPizza();
			topping = hun.displayTopping(isVeg);
			drinks = hun.displayDrinks();
			addsOn = hun.displayAddOns();
		}
		
		// Hungry Brust Section
		else {
			HungryBrust hunBrust = new HungryBrust();
			System.out.println("Select your Pizza:");
			hunBrust.selectPizza(isVeg);
			//hunBrust.selectedPizza(isVeg);
			topping = hunBrust.displayTopping(isVeg);
			drinks = hunBrust.displayDrinks();
			addsOn = hunBrust.displayAddOns();
		}
		
		
		
		
	}
}
