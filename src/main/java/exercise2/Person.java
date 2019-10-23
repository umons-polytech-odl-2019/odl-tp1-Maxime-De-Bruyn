package exercise2;
import java.util.*;

class Person {
	private int age;
	private static int totalAge = 0;
	private static int populationSize = 0;

	public Person(int age){
		this.age = age;
		totalAge += this.age;
		populationSize ++;
	}
	public static int computePopulationSize(){
		return populationSize;
	}
	public static float computeAveragePopulationAge(){
		return (float)totalAge/populationSize;
	}
	public static void resetPopulation(){
		totalAge = 0;
		populationSize = 0;
	}
}
