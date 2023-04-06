package Pizza;

import java.util.Scanner;

public class Pizza {
	
	String VegTopping[] = {"Grilled Mushroom","Fresh Tomato","Spicy Panner","Red Pepper","Jalapeno","Black Olive","Crip Capsium","Onion","Extra Cheese"};
	String NonVegTopping[] = {"Pepper Barbecue Chicken","Chicken Sausage","Chicken Tikka","Chicken Pepperoni","Grilled Chicken Rasher","Peri-Peri Chicken"};
	String drinks[] = {"Coca Cola","Mirinda","Frooti","Maaza","Pepsi"};
	String addOns[] = {"Veg Parcel","Coco Lava Cake","Taco Mexican","Red Velvet","Butter-Scotch Mouse Cake"};
	
	private int drinkPrice = 40;
	private int bagPackPrice = 40;
	private int addOnsPrice = 130;
	private int toppingPrice = 45;
	
	public products displayTopping(Boolean isVeg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Toppings:");
		products prod = new products();
		if(isVeg) {
			for(int i=0; i<VegTopping.length; i++) {
				System.out.println((i+1) + ":\t" + (VegTopping[i]));
			}
			int idx = sc.nextInt();
			prod.product = VegTopping[idx-1];
		} else {
			for(int i=0; i<NonVegTopping.length; i++) {
				System.out.println((i+1) + ":\t" + (NonVegTopping[i]));
			}
			int idx = sc.nextInt();
			prod.product = VegTopping[idx-1];
		}
		prod.price = toppingPrice;
		sc.close();
		return prod;
	}
	
	public int takeAway() {
		System.out.println("Extra Delivery Charges:\t₹"+bagPackPrice);
		return bagPackPrice;
	}
	
	public products displayAddOns() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add Ons:");
		products prod = new products();
		for(int i=0; i<addOns.length; i++) {
			System.out.println((i+1) + ":\t" + (addOns[i]));
		}
		int idx = sc.nextInt();
		prod.product = addOns[idx-1];
		prod.price = addOnsPrice;
		sc.close();
		return prod;
	}
	
	public products displayDrinks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Drinks:");
		products prod = new products();
		for(int i=0; i<drinks.length; i++) {
			System.out.println((i+1) + ":\t" + (drinks[i]));
		}
		int idx = sc.nextInt();
		prod.product = drinks[idx-1];
		prod.price = drinkPrice;
		sc.close();
		return prod;
	}
	
}
