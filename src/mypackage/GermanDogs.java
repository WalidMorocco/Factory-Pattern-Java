package mypackage;

public class GermanDogs extends DogAdoption {
	
	protected Dog pickDog(String race) {
		if (race.equalsIgnoreCase("sheaperd")) {
			return new GermanSheaperd();
		} else if (race.equalsIgnoreCase("husky")) {
			return new GermanHusky();
		} else return null;
	}

}
