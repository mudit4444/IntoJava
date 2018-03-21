
public class MyException {

	
	public static void main(String[] args) {
		
		try{
			throw new MyFirst();
		}
		catch(MyFirst mf){
			System.out.println(mf);
			System.out.println(mf.getName());
		}
		//MyFirst obj = new MyFirst();
		//obj.toString();
		//obj.getName();
		//System.out.println("Hello");
		

	}

}

class MyFirst extends Exception{
	
	public void Excep(){
		System.out.println("My first ");
	}
	
	public String toString() {
		return("My First Exception");
		
	}
	
	public String getName(){
		return("Hello My First Exception");
	}
}
