package mypackage;

public abstract class DogAdoption {
	
	public Dog adoptDog(String type) {
		Dog dog;
		
		dog = pickDog(type);
		dog.bark();
		dog.growl();
		
		System.out.println("\nDog's attributes:");
		System.out.println("\n	Race:" + dog.getRace());
		System.out.println("\n	Color:" + dog.getColor());
		System.out.println("\n	Size:" + dog.getSize());
		
		return dog;
	}

	public void getAttributes() {
		
	}
	protected abstract Dog pickDog(String type);

}
