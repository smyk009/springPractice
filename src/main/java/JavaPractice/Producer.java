package JavaPractice;

import java.util.Queue;

public class Producer extends Thread {

	private final Queue sharedQ;

	public Producer(Queue sharedQ) {
		this.sharedQ = sharedQ;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			synchronized (sharedQ) {
				while (sharedQ.size() >= 1) {
					try {
						System.out.println("Queue is full, waiting");
						sharedQ.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Producing: "+i);
				sharedQ.add(i);
				sharedQ.notify();
			}
		}
	}
}
