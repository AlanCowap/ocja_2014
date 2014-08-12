/**
 * Sample code to demonstrate Inheritance, and Polymorphism
 *	
 * @author Alan Cowap
 * @version 1.0 Basic classes (Person, InheritApp)
 * @version 1.1 Add a Cat class
 * @version 1.2 Add a Dog class
 * @version 1.3 Add an Animal superclass, and do initial refactor
 * @version 1.4 Override Object.toString() method in Animal class
 * @version 1.5 Inherit an abstract method (move) from an abstract superclass and implement it
*/


public class InheritApp{

	public static void main(String[] args){
		System.out.println("Hello world");
		InheritApp ia = new InheritApp();
		
		Person p = new Person("Tyler");		
		ia.testNoise(p);
		p.move();

		Cat c = new Cat("Charlie");
		ia.testNoise(c);
		c.move();

		Dog d = new Dog("Scooby");
		ia.testNoise(d);
		d.move();

		System.out.println(p +" "+ c +" "+ d);
		
	}


	private void testNoise(Animal animal){
		animal.makeNoise();
	}

	private void testMove(Animal animal){
		animal.move();
	}

}

abstract class Animal{
	private String name;
	private String noise;

	public Animal(String name, String noise){
		this.name = name;
		this.noise = noise;
	}
	
	public abstract void move();
	
	public void makeNoise(){
		System.out.println(name + " says " + noise);
	}

	public String toString(){
		return this.name;
	}

}

class Person extends Animal{
	private static final String PERSON_NOISE = "everybody make some noise";

	public Person(String name){
		super(name, PERSON_NOISE);
	}

	public void move(){
		System.out.println("Move like a Person");
	}

}


class Cat extends Animal{
	private static final String CAT_NOISE = "meow";

	public Cat(String name){
		super(name, CAT_NOISE);
	}

	public void move(){
		System.out.println("Move like a Cat");
	}
	
}

class Dog extends Animal{
	private static final String DOG_NOISE = "woof";

	public Dog(String name){
		super(name, DOG_NOISE);
	}

	public void move(){
		System.out.println("Move like a Dog");
	}

}

