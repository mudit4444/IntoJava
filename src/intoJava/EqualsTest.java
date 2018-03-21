
public class EqualsTest {
	public static void main(String [] args){
		Moof one = new Moof(8);
		Moof two = new Moof(9);
		
		if (one.equals(two)){
			System.out.println("The numbers are same");
		} else {
			System.out.print("Different");
		}
	}
}
	class Moof{
		private int moofValue;
		Moof(int val){
			moofValue = val;
		}
		public int getmoofValue(){
			return moofValue;
		}
		public boolean equals(Object o){
			if((o instanceof Moof) && (((Moof)o).getmoofValue()
			== this.moofValue)){
			return true;
		} else {
			return false;
		}
	}
}

