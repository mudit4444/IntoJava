//import java.util.Iterator;
import java.util.*;

class Student{  
	  int rollno;  
	  String name;  
	  int age;  
	  Student(int rollno,String name,int age){  //constructor to make enable parameters
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }
	}  

public class PracArrayList extends Student {
	PracArrayList(int rollno, String name, int age) { //Needs to be used to make Student and PracArrayList same
		super(rollno, name, age);
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args){
		/*ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Mudit");
		al.add("Ashish");
		al.add("Ashok");*/
		
		/*Iterator itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
			/*for(String ob:al){
				System.out.println(ob);
			}*/
		Student S1 = new Student(123,"mudit",111);
		Student S2 = new Student(234,"ashish",222);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(S1);
		al.add(S2);
		
		Iterator<Student> itr = al.iterator();
		while(itr.hasNext()){ //untill there is more value
			Student st = itr.next(); //new object of Student to increase the counter and keep the next value in "st".
			System.out.println(st.rollno + " "+ st.name + " "+ st.age);
		}
	}
}
