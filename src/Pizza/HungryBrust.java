package Pizza;

import java.util.Scanner;

public class HungryBrust extends Pizza {

	String VegPizza[] = {"Pepper Panner Pizza","Indi Tandoori Panner Pizza","Farmhouse Pizza","Fresh Veggie"};
	String NonVegPizza[] = {"5 Chicken Feast Pizza","Pepper Barbecue Chicken Pizza","Indo Fusion Chicken","Chicken Sausage Pizza","Chicken Golden Delight Pizza"};
	String crust[] = {"New Hand Tossed", "100% Wheat Thin Crust", "Cheese Burst", "Fresh Pan", "Classic Hand Tossed"};
	
	int crustPrice = 100;
	String crustName = "";
	int mediumBasePrice = 579;
	int largeBasePrice = 839;
	
	// Printing all the Medium & Large Size Pizza:
	public void selectPizza(boolean isVeg) {
		if(isVeg) {
			System.out.println("Hungry Brust (Veg):");
			for(int i=0; i<VegPizza.length; i++) {
				System.out.println("\t"+(i+1) +". "+ (VegPizza[i]));
			}
		} else {
			System.out.println("Hungry Brust (Non Veg):");
			for(int i=0; i<NonVegPizza.length; i++) {
				System.out.println("\t"+(i+1) +". "+ (NonVegPizza[i]));
			}
		}
		return ;
	}
	
	// Size of the Pizza
	public int selectSize() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sizes\n============\n1. Medium\t₹"+mediumBasePrice+"\n2. Large\t₹"+largeBasePrice);
		System.out.println("Select the Size");
		int size = sc.nextInt();
		if(size==1)
			return mediumBasePrice;
		return largeBasePrice;
	}
	
	// Crust of Pizza
	public void crustPizza() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Crust");
		for(int i=0; i<crust.length; i++) {
			System.out.println((i+1)+". "+crust[i]);
		}
		int idx = sc.nextInt();
		crustName = crust[idx-1];
		System.out.println("Crust Added.");
		sc.close();
	}
}
