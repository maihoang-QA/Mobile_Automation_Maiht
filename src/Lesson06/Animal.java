package Lesson06;

import java.security.SecureRandom;

public class Animal {
	int randomSpeed;
	String defaultName = "animal" ;
	
	public static int speed(int maxSpeed) {
		 SecureRandom randomSpeed = new SecureRandom();
		 return randomSpeed.nextInt(maxSpeed);
	}
	
	
	public static String getName(String defaultName) {
		return defaultName;
	}

	

}
