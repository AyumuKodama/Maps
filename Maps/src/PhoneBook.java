import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		Scanner scnr = new Scanner(System.in);
		boolean appOpen = true;
		while(appOpen) {
			System.out.println("What do you want to do with the phonebook?");
			System.out.println("Options:");
			System.out.println("Add new contact.......A");
			System.out.println("Find contact..........F");
			System.out.println("Print all contacts....P");
			System.out.println("Close app.............C");
			System.out.println();
			String option = scnr.next();
			
			if(option.equalsIgnoreCase("A")) {
				
				System.out.println("Please input a name.");
				String name = scnr.next();
				System.out.println("Please input his/her phone number.");
				int number = scnr.nextInt();
				phoneBook.put(name, number);
				System.out.println("You have successfully added " + name + "to the phone book.");
				
			} else if(option.equalsIgnoreCase("F")) {
				
				System.out.println("Whose phone number do you want to find?");
				String name = scnr.next();
				if (phoneBook.containsKey(name)) {
					System.out.println(phoneBook.get(name));
				} else {
					System.out.println("That person's phone number is not in the phone book.");
				}
				
			} else if(option.equalsIgnoreCase("P")) {
				
				phoneBook.forEach((name, number) -> System.out.println(name + "\t" + number));
				
			} else if (option.equalsIgnoreCase("C")) {
				
				System.out.println("The app is closed.");
				appOpen = false;
				
			} else {
				
				System.out.println("That is not a valid option.");
				
			}		
		}				
		scnr.close();
	}
}
