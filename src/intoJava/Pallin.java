class Test{
	public void PallindromFind(){
	String s = "MALAYALAM";
	String s1 = "";
	 for (int j = s.length()-1; j >= 0; j--){
		  s1 = s1 + s.charAt(j);
	 }
	 if(s.equalsIgnoreCase(s1)){
		 System.out.print("Pallindrome");
	 }
	 else{
		 System.out.println("Not a pallindrome");
	 }
	}
}
public class Pallin {
public static void main(String [] args){
Test ob = new Test();
ob.PallindromFind();
}
}
