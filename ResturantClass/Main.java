package ResturantClass;

public class Main {
	public static void main(String[] args) {
		MealOrder regularMeal = new MealOrder();
		regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
		regularMeal.setDrinkSize("LARGE");
		regularMeal.printItemizedList();
		
		System.out.println("\n\n\n\n\n");
		
		MealOrder secondMeal = new MealOrder("turkey", "7-up", "chilli");
		secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
		secondMeal.setDrinkSize("SMALL");
		secondMeal.printItemizedList();
		
		System.out.println("\n\n\n\n\n");
		
		MealOrder DeluxeMeal = new MealOrder("deluxe", "7-up", "Chili");
		DeluxeMeal.addBurgerToppings("BACON", "CHEESE", "MAYO", "AVACADO", "LETTUCE");
		DeluxeMeal.setDrinkSize("SMALL");
		DeluxeMeal.printItemizedList();
	}

}
