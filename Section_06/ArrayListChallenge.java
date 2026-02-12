package Section_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		ArrayList<String> groceryList = new ArrayList<>();
		boolean userAns = true;
		while(userAns) {
			System.out.println("Available Actions:\n0 - to shutdown\n1 - to add item(s) to list(comma delimited list)"
					+ "\n2 - to remove any items(comma delimited list)");
			System.out.print("Enter a nunber for which action you want to do: ");
			int userInput = obj.nextInt();
			obj.nextLine();// consume newline
			if(userInput == 0) {
				userAns = false;
			}else if(userInput == 1) {
				System.out.print("Enter the item(s) you want to add in the list(comma delimited list) : ");
				String input = obj.nextLine();
				String[] values = input.split(",");
				List<String> newItems = List.of(values);
				for(String item: newItems) {
					if(!groceryList.contains(item)) {
						groceryList.add(item);
					}
				}
				groceryList.sort(Comparator.naturalOrder());
				System.out.println(groceryList);
			}else if(userInput == 2) {
				System.out.print("Enter the item(s) you want to remove in the list(comma delimited list) : ");
				String input = obj.nextLine();
				String[] values = input.split(",");
				List<String> newItems = List.of(values);
				for(String item: newItems) {
					if(groceryList.contains(item)) {
						groceryList.remove(item);
					}
				}
				Collections.sort(groceryList);
				System.out.println(groceryList);
			}else {
				System.out.println("Enter enter the correct number.");
			}
			
		}
		obj.close();
	}

}
