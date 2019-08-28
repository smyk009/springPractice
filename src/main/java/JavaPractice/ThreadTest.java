package JavaPractice;

public class ThreadTest {

	public static void main(String[] args) {
		Message msg = new Message("Process it");
		Runnable waiter = () -> {
			String name = Thread.currentThread().getName();
			synchronized(msg) {
				System.out.println(name+" waiting to get notified at time " + System.currentTimeMillis());
				try {
					msg.wait();
				} catch (InterruptedException e) {				
					e.printStackTrace();
				}
				System.out.println(name+" Thread got notified at time " + System.currentTimeMillis());
			}
		};
		new Thread(waiter, "waiter").start();
		
		Notifier notifier = new Notifier(msg);
		new Thread(notifier, "notifier ").start();
		System.out.println("All the threads are started");
	}
}
