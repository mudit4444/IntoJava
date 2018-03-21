
public class ReverseAString {

	public static void main(String[] args) {
		
		String str = "Mudit";
		String strnew = "";
	//	for(int i=0; i<str.length(); i++) {
		
				
			for(int j=str.length()-1; j>=0; j--) {
				
				strnew = strnew + str.charAt(j);
				
				
			}
			System.out.println("new string is " +strnew); 
		}
		
	//}
	
	

}
