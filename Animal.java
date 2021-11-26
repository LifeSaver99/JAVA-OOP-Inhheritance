public class Animal {

	String name;
	int age;
	int hungerLevel;
	int speed;
	int strength;
	int tiredness;

	public Animal(String Name, int Age, int HungerLevel, int Speed, int Strength, int Tiredness) {
		name = Name;
		age = Age;
		hungerLevel = HungerLevel;
		speed = Speed;
		strength = Strength;
		tiredness = Tiredness;

	}

	public void Eat() {
		System.out.println("i am Eating");
	}

}

class LandAnimals extends Animal {
	public LandAnimals(String Name, int Age, int HungerLevel, int Speed, int Strength, int Tiredness) {
		super(Name, Age, HungerLevel, Speed, Strength, Tiredness);
	}

	public void run() {
		System.out.println("i am running");
	}

}

class Lion extends LandAnimals {
	int clawStrength;

	public Lion(String Name, int Age, int HungerLevel, int Speed, int Strength, int Tiredness, int ClawStrength) {
		super(Name, Age, HungerLevel, Speed, Strength, Tiredness);
		clawStrength = ClawStrength;
	}
}

class SeaAnimals extends Animal {

	public SeaAnimals(String Name, int Age, int HungerLevel, int Speed, int Strength, int Tiredness) {
		super(Name, Age, HungerLevel, Speed, Strength, Tiredness);

	}

	public void swim() {
		System.out.println("i am swimming");
	}

}

class Whale extends SeaAnimals {
	int swimStrength;

	public Whale(String Name, int Age, int HungerLevel, int Speed, int Strength, int Tiredness, int SwimStrength) {
		super(Name, Age, HungerLevel, Speed, Strength, Tiredness);
		swimStrength = SwimStrength;
	}
	  
}
