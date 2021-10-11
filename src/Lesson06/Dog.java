package Lesson06;

public class Dog extends Animal{
    public String nameDog;
	
	public int speedDog() {
		return Animal.speed(60);	 
	}
	
	public String getNameDog() {
		return nameDog = Animal.getName("Dog");
	 
	}

	
}
