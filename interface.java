import java.io.*;
interface Animals{
	void speak();
	void eat();
}
class Cat implements Animals{
	public void speak(){
		System.out.println("Meow");
	}
	public void eat(){
		System.out.println("Eats Fish");
	}
}
class Dog implements Animals{
	public void speak(){
		System.out.println("Bow Bow");
	}
	public void eat(){
		System.out.println("Eats meat");
	}
}
class Interface{
	public static void main(String args[]){
		Animals ab=new Cat();
		Animals cd=new Dog();
		ab.speak();
		ab.eat();
		cd.speak();
		cd.eat();
	}
}