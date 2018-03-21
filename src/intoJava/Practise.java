class Animal{
	String name = null;
}

class Dog extends Animal{
}

public class Practise {
public static void main(String args[]){
	Dog obj = new Dog();
	obj.name = "Gandu";
	//String name = null;
	System.out.println("the message"+obj.name);
}

}
