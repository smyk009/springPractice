package JavaPractice;

public class Notifier implements Runnable {
	
	private Message msg;
	
	public Notifier(Message msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+"started");
		synchronized(msg) {
			msg.setMessage(name+ " Notifier work done");
			msg.notify();
		}
	}

}
