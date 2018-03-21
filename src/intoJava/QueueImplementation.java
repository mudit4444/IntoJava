import java.util.LinkedList;
import java.util.Queue;


public class QueueImplementation {

	public static void main(String[] args) {
		//arrayblockingqueue has a limited space which we define like in this case(3).
		//Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
			
		Queue<Integer> q1 = new LinkedList<Integer>();
		q1.offer(1);
		q1.offer(2);
		q1.offer(3);
		//q1.add(2);
		//q1.add(3);
		try {
			q1.offer(4);
		} catch (IllegalStateException e) {
			System.out.println("ERROR!!! Tried putting more value than allowed!!!");
		}
		
		//element --> gives the first element of the queue, in this case 1
		System.out.println("head of the queue is " +q1.element());
		
		//peek() --> is used to return first element of the queue
		System.out.println("using peek to find value : " +q1.peek());
		
		//remove --> removes the head of the queue, in this case 1	
		//Integer value = q1.remove();
		System.out.println("removed element is "+q1.remove());
		
		//poll() is same as remove
		System.out.println("removing " + q1.poll() + " using poll method");
		
		for(int num : q1) {
		System.out.println(num);
	}
		
		
	}
}
