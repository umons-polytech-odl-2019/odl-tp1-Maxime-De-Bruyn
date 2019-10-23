package exercise1;
import java.util.*;


public class Person {
	private String name;
	private int age;

	public Person(){
		System.out.print("Entrez le nom : ");
		Scanner lectureClavier = new Scanner(System.in);
		name = lectureClavier.next();

        System.out.print("Entrez l'age : ");
        age = lectureClavier.nextInt();
	}
	public Person(String nom, int Age){
		name = nom;
		age = Age;
	}
	public String getName(){return name;}

	public void setName(String nom){name = nom;}

	public int getAge() {return age; }

	public void setAge(int Age) {age = Age; }

	public void affiche() {
		System.out.print("Nom : ");
		System.out.println(name);
	    System.out.print("Age : ");
	    System.out.println(age);
	}
}
