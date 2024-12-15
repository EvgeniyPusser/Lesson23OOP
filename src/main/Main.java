package main;

import employees.SalesEmployee;
import employees.WageEmployee;
import product.AlcoholDrink;
import product.MeatProd;

public class Main {

	public static void main(String[] args) {
		
//		WageEmployee wageEmployee = new WageEmployee(1, "Pipkin Er", 34, "worker", 0, 78, 100);
//		System.out.println(wageEmployee);
//		SalesEmployee salesEmployee = new SalesEmployee(1, "Watchi Potchi", 34, "free agent", 0, 1.6, 12000);
//		System.out.println(salesEmployee);
		
		AlcoholDrink alcoholDrink = new AlcoholDrink("M&H", 500, 77, "700 mL" , false, 50);
		System.out.println(alcoholDrink);
		MeatProd meatProd = new MeatProd("Back Leg Red Meat", 7.74, 201, "0.10 kg", "Beef Round");
		System.out.println(meatProd);


	}

}
