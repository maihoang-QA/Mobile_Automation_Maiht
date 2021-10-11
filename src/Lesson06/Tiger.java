package Lesson06;

public class Tiger extends Animal {
	public String nameTiger;
	
	public int speedTiger() {
		return Animal.speed(100);
	}
	
	public String getNameTiger() {
		return nameTiger = Animal.getName("Tiger");
	 
	}

}
