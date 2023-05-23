package gittest;


class Animal{
void eat() {
	System.out.println("THIS IS EAT METHOD");
	
}
}
class Dog extends Animal{
	void eat(){
		System.out.println("this method is in Dog class ");
		
	}
}
public class Main {
	public static void main(String[] args) {
		Animal a=new Animal();
		Dog d= new Dog();
		a.eat();
		d.eat();
	}

}
