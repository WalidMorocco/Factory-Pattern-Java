package mypackage;

import java.util.Scanner;

public class DogAdoptionDrive {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("From which region do you want your dog from ? (Asia / Germany)");
		String region = keyboard.nextLine();
		
		if (region.equalsIgnoreCase("Asia")) {
			
			System.out.println("Choose your futur dog's race ? (Spitz / Chihuahua)");
			String race = keyboard.nextLine();
			DogAdoption asianDog = new AsianDogs();
			
			if (race.equalsIgnoreCase("Spitz")) {
				
				Dog dog = asianDog.adoptDog("Spitz");
				
			} else if (race.equalsIgnoreCase("Chihuahua")){
				
				Dog dog = asianDog.adoptDog("Chihuahua");
				
			}
			
		} else if (region.equalsIgnoreCase("Germany")) {
			
			System.out.println("Choose your futur dog's race ? (Sheaperd / Husky)");
			String race = keyboard.nextLine();
			DogAdoption germanDog = new GermanDogs();
			
			if (race.equalsIgnoreCase("Sheaperd")) {
				
				Dog dog = germanDog.adoptDog("Sheaperd");
				
			} else if (race.equalsIgnoreCase("Husky")){
				
				Dog dog = germanDog.adoptDog("Husky");
				
			}
		}
	}
}
