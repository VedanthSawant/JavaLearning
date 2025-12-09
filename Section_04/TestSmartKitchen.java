package Section_04;

public class TestSmartKitchen {
	public static void main(String[] args) {
		SmartKitchen kitchen = new SmartKitchen();
		
		kitchen.setKitchenState(true, false, true);
		kitchen.doKitchenWork();
	}

}
