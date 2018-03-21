package intoJava;

import java.util.Arrays;

public class MyComparable implements Comparable {

	private int flightTime;
	public MyComparable(int flightTime) {
		this.flightTime = flightTime;
	}
	public static void main(String[] args) {
		
		MyComparable flight = new MyComparable(23);
		MyComparable flight1 = new MyComparable(2);
		MyComparable flight2 = new MyComparable(3);
		
		MyComparable[] check = {flight, flight1, flight2};
		Arrays.sort(check);

	}

	@Override
	public int compareTo(Object o) {
		MyComparable myComparable = (MyComparable) o;
		
		if(flightTime < myComparable.flightTime) {
			return -1;
		}
		else if(flightTime > myComparable.flightTime){
			return 1;
		}
		return 0;
	}
	
	

}
