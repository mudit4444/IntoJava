package intoJava;

public class DeepShallowCloning {

	
	public static void main(String[] args) {
		
		Cloning abc = new Cloning("Mudit", "123");
		System.out.println("Bfore cloning the values are " +abc.getName() + " and " + abc.getObj().getName());
		Cloning abc1 = (Cloning) abc.clone();
		System.out.println("After cloning the values are " +abc1.getName() + " and " + abc1.getObj().getName());
		
		abc.setName("ashish");
		abc.getObj().setName("567");
		
		System.out.println("after changing the values are " +abc.getName() + " and " + abc.getObj().getName());
		System.out.println("after changing the values clonned instances are " +abc1.getName() + " and " + abc1.getObj().getName());
		

	}

}
class First{
	
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
		public First (String m){
			this.name=m;
		}
}

class Cloning implements Cloneable{
		
	String name;
	//String id;
	public First obj;
	public First getObj() {
		return obj;
	}
	public void setObj(First obj) {
		this.obj = obj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	*/
	public Cloning(String s, String n){
		this.name = s;
		//this.id = n;
		obj = new First(n);
	}
	
	public Object clone(){
		/*try{						//shallow cloning
		return super.clone();
		}
		catch(CloneNotSupportedException e){
			return null;
		}*/
		
		
		
		Cloning s2 = new Cloning(name, obj.getName());		//DEEP CLONING
			return s2;
	}
}