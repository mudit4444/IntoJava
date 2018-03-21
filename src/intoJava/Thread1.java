
public class Thread1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread11());
		
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("Mudit's Thread");
		System.out.println("After Changing name " +Thread.currentThread());
		t1.start();

	}

}

class MyThread11 extends Thread {
	
	//Thread t1 = new Thread();
	
	public void run() {
		
		for( int i=0 ; i<10; i++) {
			
		System.out.println("this is my thread" + +i);

		try {
			Thread.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
		
	}
	
}
