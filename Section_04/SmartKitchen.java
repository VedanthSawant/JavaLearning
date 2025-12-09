package Section_04;

public class SmartKitchen {
	
	private Refrigerator iceBox;
	private DishWasher dishWasher;
	private CoffeeMaker brewMaster;
	
	public SmartKitchen() {
		iceBox = new Refrigerator();
		dishWasher = new DishWasher();
		brewMaster = new CoffeeMaker();
	}
	
	
	public Refrigerator getIceBox() {
		return iceBox;
	}

	public DishWasher getDishWasher() {
		return dishWasher;
	}

	public CoffeeMaker getBrewMaster() {
		return brewMaster;
	}


	public void pourMilk(boolean value) {
		iceBox.setHasWokToDo(value);
	}
	
	public void addWater(boolean value) {
		brewMaster.setHasWokToDo(value);
	}
	
	public void loadDishwasher(boolean value) {
		dishWasher.setHasWokToDo(value);
	}
	
	public void setKitchenState(boolean milk, boolean water, boolean dish) {
		pourMilk(milk);
		addWater(water);
		loadDishwasher(dish);
	}
	
	public void doKitchenWork() {
		iceBox.orderFood();
		dishWasher.doDishes();
		brewMaster.brewCoffee();
	}
	
}

class Refrigerator{
	public boolean hasWokToDo;

	public void setHasWokToDo(boolean hasWokToDo) {
		this.hasWokToDo = hasWokToDo;
	}
	
	public void orderFood() {
		if(hasWokToDo) {
			System.out.println("Pour Milk");
			hasWokToDo = false;
		}
	}
}

class DishWasher{
	public boolean hasWokToDo;

	public void setHasWokToDo(boolean hasWokToDo) {
		this.hasWokToDo = hasWokToDo;
	}
	
	public void doDishes() {
		if(hasWokToDo) {
			System.out.println("Doing Dishes");
			hasWokToDo = false;
		}
	}
}

class CoffeeMaker{
	public boolean hasWokToDo;

	public void setHasWokToDo(boolean hasWokToDo) {
		this.hasWokToDo = hasWokToDo;
	}
	
	public void brewCoffee() {
		if(hasWokToDo) {
			System.out.println("Brewing Coffee");
			hasWokToDo = false;
		}
	}
	
}