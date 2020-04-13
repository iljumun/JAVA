
public class Test10 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.breath();
		d.bark();
		
		Cat c = new Cat();
		c.breath();
		c.Meow();
		
		Animal a = d; //Dog객체이면서 Animal 타입
		a.breath(); 
		
		Animal a1 = c; //Cat객체이면서 Animal 타입
		a1.breath();
				
		Dog d2 = (Dog)a;
		d2.bark();
		d2.breath();
		
		Animal a3 = new Dog();
		a3.breath();
		Dog d3 = (Dog)a3;
		d3.bark();
		d3.breath();
		
		Animal a4 = new Cat();
		a4.breath();
		Cat c3 = (Cat)a4;
		c3.breath();
		c3.Meow();
		
		/*Dog d11 = new Dog();
		Animal a11 = d11;
		Cat c11 = (Cat)a11;
		c11.breath();
		c11.Meow();*/
	}

}
