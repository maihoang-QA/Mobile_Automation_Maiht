package Lesson06;

public class TestAnimal {

	public static void main(String[] args) {
		Horse horse = new Horse();
		Tiger tiger = new Tiger();
		Dog dog = new Dog();
		

		if(horse.speedHorse() >= tiger.speedTiger() && horse.speedHorse() >= dog.speedDog()) {
			System.out.printf("Winner is" +" " + horse.getNameHorse()+ "," +" " + "With speed" +" "+ horse.speedHorse());
		}
		else if(tiger.speedTiger() >= horse.speedHorse() && tiger.speedTiger() >= dog.speedDog()) {
			System.out.printf("Winner is" +" " + tiger.getNameTiger()+ "," +" " + "With speed" +" "+ tiger.speedTiger());

		}
		else {
			System.out.printf("Winner is" +" " + dog.getNameDog()+ "," +" " + "With speed" +" "+ dog.speedDog());

		}
	}
}

		
		

		



