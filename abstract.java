abstract class Animals{
	String color,breed,name;
	abstract void eat();
	void speak(){
		System.out.println("Speak");
	}
}
class concrete extends Animals{
	void eat(){
		System.out.println("It will override eat function ");
	}
}
class abstract1{
	public static void main(String args[]){
		concrete x=new concrete();
		x.eat();
		x.speak();
	}
}