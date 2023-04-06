package Pizza;
import java.util.*;
public class Main {
	
	public static void displayPizza(Boolean isVeg) {
		System.out.println("Select the Pizza from the Menu:");
		System.out.println("==================================");
		Hungry obj = new Hungry();
		obj.selectPizza(isVeg);
		HungryBrust obj1 = new HungryBrust();
		obj1.selectPizza(isVeg);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Veg vs Non-Veg
		System.out.println("Select the Size\n1.Veg\t2.Non-Veg");
		boolean isVeg = (sc.nextInt()==1)?true:false;
		
		// Type of Crust
		displayPizza(isVeg);
		System.out.println("Select your Hunger\n1. Hungry\t2. Hungry Brust");
		int typeHungry = sc.nextInt();
		if(typeHungry==1) {
			Hungry hun = new Hungry();
			System.out.println("Select your Pizza:");
			hun.selectPizza(isVeg);
			System.out.println("Pizza is Added");
			
		} else {
			HungryBrust hunBrust = new HungryBrust();
			System.out.println("Select your Pizza:");
			hunBrust.selectPizza(isVeg);
			System.out.println("Pizza is Added");
			
		}
		
	}
}
