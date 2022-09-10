package mypackage;

public class AsianDogs extends DogAdoption {
	
	protected Dog pickDog(String race) {
		if (race.equalsIgnoreCase("spitz")) {
			return new AsianSpitz();
		} else if (race.equalsIgnoreCase("chihuahua")) {
			return new AsianChihuahua();
		} else return null;
	}

}
