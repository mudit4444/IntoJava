package intoJava;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class ProducerConsumerAnalysis {

	
	public static void main(String[] args) {
	
		BlockingQueue block = new LinkedBlockingQueue();
		
		Thread prodThread = new Thread(new Producer(block));
		Thread consThread = new Thread(new Consumer(block));
		
		
		prodThread.start();
		consThread.start();
		
	}
}

	
	class Producer implements Runnable {
		
		public final BlockingQueue block;
		
		public Producer(BlockingQueue block) {
			this.block = block;
		}

		public void run() {
			
			
			
			for(int i=0; i<10;i++) {
				
				System.out.println("new entry is" +i);
				
				try {
					block.put(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		
	}
	
	class Consumer implements Runnable {

		
		public final BlockingQueue block;
		
		public Consumer(BlockingQueue block) {
			this.block = block;
		}
		
		
		public void run() {
			
			
			while(true) {
				
				System.out.println("consuming");
				
				try {
					block.take();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
