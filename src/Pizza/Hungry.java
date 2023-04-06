package Pizza;


import java.util.Scanner;

public class Hungry extends Pizza {

	String VegPizza[] = {"Veg Loaded Pizza","Tomoto Pizza", "Golden Corn Pizza","Onion Pizza","Cheesy Pizza"};
	String NonVegPizza[] = {"Specied Double Chicken Pizza","Chicken Maximus Pizza",
			"Chicken Dominator Pizza","Non Veg Supreme Pizza","Indi Chicken Tikka Pizza"};
	String crust[] = {"Fresh Pan","Classic"};
	
	String Pizza="";
	int price = 0;
	int regularSizePrice = 319;
	int crustPrice = 100;
	String crustPizza = "";
	
	
	// Printing all the Regular Size Pizza:
	public void selectPizza(boolean isVeg) {
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
	}
	
	
	//input for section of Pizza
	public void selectedPizza(Boolean isVeg) {
		Scanner sc = new Scanner(System.in);
		int pizzaNumber = sc.nextInt();
		if(isVeg) {
			Pizza = VegPizza[pizzaNumber-1];
		} else {
			Pizza = NonVegPizza[pizzaNumber-1];
		}
		sc.close();
	}
	
	
	// Size---> Regular
	public int selectSize() {
		System.out.println("Sizes\n============\nRegular\t₹"+regularSizePrice);
		return regularSizePrice;
	}
	
	
	// Crust of Pizza
	public void crustPizza() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Crust");
		for(int i=0; i<crust.length; i++) {
			System.out.println((i+1)+". "+crust[i]);
		}
		int idx = sc.nextInt();
		crustPizza = crust[idx-1];
		price = price + crustPrice;
		System.out.println("Crust Added.");
		sc.close();
	}
	
	
	
	
}
