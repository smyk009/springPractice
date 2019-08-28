package JavaPractice;

import java.util.Queue;

public class Consumer extends Thread {

	private final Queue sharedQ;

	public Consumer(Queue shareQ) {
		this.sharedQ = shareQ;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		while(true) {
			synchronized (sharedQ) {
				while(sharedQ.size() == 0) {
					try {
						System.out.println("Queue is empty, waiting");
						sharedQ.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
				System.out.println("consuming: "+sharedQ.poll());
				sharedQ.notify();
			}
		}
	}
}
