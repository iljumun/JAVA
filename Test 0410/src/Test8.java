
public class Test8 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.breath();
		Animal a = d;
		a.breath();
		Dog d1 = (Dog)a;
		d1.bark();
		d1.breath();
		
		Animal a1 = new Dog();
		a1.breath();
		Animal a2 = new Cat();
		a2.breath();
		Test1(new Dog());
	}
	
	static void Test1(Dog d) {}
	static void Test1(Cat c) {}
	
	//
	static void Test1(Animal a) {} // Animal a = new Dog();

}