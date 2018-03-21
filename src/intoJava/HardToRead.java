package intoJava;
public class HardToRead {
public static void main(String args[]){
	Bob b = new Bob("mudit" , 4);
	System.out.print(b); 
}
}
 class Bob{
		int shoeSize;
		String nickName;
		Bob(String nickName , int shoeSize){
			this.shoeSize = shoeSize;
			this.nickName = nickName;
		}
	

public String toString(){
	return ("My name is " + nickName + " and my lucky number is " +shoeSize);
}
}

