
import java.util.ArrayList;
import java.util.Collections;
public class Sorting {

	public static void main(String[] args) {
		
		int a[] = {1,21,34,3,2};
		int n= a.length;
		
		
		int temp;
		for(int i = 0; i <n; i++){
			
			for(int j =1;j<n-1;i++){
				if(a[j-1] > a[j]){
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
				
				
			}
			for(int k=0; k<n-1; k++)
			System.out.println(a[k]);
			
				}
			}
	}

		
		
		
		/*ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(21);
		al.add(54);
		al.add(2);
		al.add(5);
		al.add(3);
		
		Collections.sort(al);
		
		System.out.println(al);
		*/

