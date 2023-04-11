package Pizza;


import java.util.Scanner;

public class Hungry extends Pizza {

	String VegPizza[] = {"Veg Loaded Pizza","Tomoto Pizza", "Golden Corn Pizza","Onion Pizza","Cheesy Pizza"};
	String NonVegPizza[] = {"Specied Double Chicken Pizza","Chicken Maximus Pizza",
			"Chicken Dominator Pizza","Non Veg Supreme Pizza","Indi Chicken Tikka Pizza"};
	String crust[] = {"Fresh Pan","Classic"};
	
	int regularSizePrice = 319;
	int crustPrice = 50;
	String crustPizza = "";
	
	// Printing all the Regular Size Pizza:
	public void Menu(boolean isVeg) {
		if(isVeg) {
			System.out.println("Hungry (Veg):");
			for(int i=0; i<VegPizza.length; i++) {
				System.out.println("\t"+(i+1) +". " + (VegPizza[i]));
			}
		} else {
			System.out.println("Hungry (Non Veg):");
			for(int i=0; i<NonVegPizza.length; i++) {
				System.out.println("\t"+(i+1) +". " + (NonVegPizza[i]));
			}
		}
		return;
	}
	
	// Select your Pizza from Menu
	public products selectPizza(boolean isVeg) {
		System.out.println("Select your Pizza from Menu");
		Scanner sc = new Scanner(System.in);
		products prod = new products();
		// Display the Pizza
		if(isVeg) {
			System.out.println("Hungry (Veg):");
			for(int i=0; i<VegPizza.length; i++) {
				System.out.println("\t"+(i+1) +". " + (VegPizza[i]));
			}
		} else {
			System.out.println("Hungry (Non Veg):");
			for(int i=0; i<NonVegPizza.length; i++) {
				System.out.println("\t"+(i+1) +". " + (NonVegPizza[i]));
			}
		}
		
		// Selection of Pizza
		int pizzaNumber = sc.nextInt();
		if(isVeg) {
			prod.product = VegPizza[pizzaNumber-1];
		} else {
			prod.product = NonVegPizza[pizzaNumber-1];
		}
		sc.close();
		
		// Regular Size Price
		System.out.println("Sizes\n============\nRegular\t₹"+regularSizePrice);
		prod.price = regularSizePrice;
		return prod;
	}
	
	
	// Crust of Pizza
	public products crustPizza() {
		Scanner sc = new Scanner(System.in);
		products prod = new products();
		// Crust Selection
		System.out.println("Select your Crust");
		for(int i=0; i<crust.length; i++) {
			System.out.println("\t"+(i+1)+". "+crust[i]);
		}
		
		//input for crust
		
		int idx = sc.nextInt();
		prod.product = crust[idx-1];
		prod.price = crustPrice;
		sc.close();
		return prod;
	}
	
	
	
	
}
