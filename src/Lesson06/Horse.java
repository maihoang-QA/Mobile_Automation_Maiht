package Lesson06;
public class Horse extends Animal{
	public String nameHorse;
	
	public int speedHorse() {
		return Animal.speed(75);
	}
	
	public String getNameHorse() {
		return nameHorse = Animal.getName("Horse");
	 
	}

}
