package intoJava;

public class ArrayListUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] Add(int[] number, int num) {
		int [] arr = new int[10];
		for(int i=0 ; i<arr.length; i++) {
			arr[i] = number[i];
		}
		arr[arr.length-1] = num;
		
		return arr;
	}
	
	
	public void remove(int num) {
		
	}

}

