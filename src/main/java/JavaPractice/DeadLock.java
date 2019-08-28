package JavaPractice;

public class DeadLock {

	public static void main(String[] args) throws InterruptedException {
		Object ob1 = new Object();
		Object ob2 = new Object();
		Object ob3 = new Object();
		
		Runnable syncThread = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + "acquiring lock on" +ob1);
			synchronized(ob1) {
				 System.out.println(name + " acquired lock on "+ob1);
				 try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
				 synchronized (ob2) {
					 System.out.println(name + " acquired lock on "+ob2);
					 try {
						Thread.sleep(30000);
					} catch (InterruptedException e) {					
						e.printStackTrace();
					}
				}
				 System.out.println(name + " released lock on "+ob2);
	        }
	        System.out.println(name + " released lock on "+ob1);
	        System.out.println(name + " finished execution.");			
		};
		
		Thread t1 = new Thread(syncThread, "t1");
		Thread t2 = new Thread(syncThread, "t2");
		Thread t3 = new Thread(syncThread, "t3");
		
		t1.start();
        Thread.sleep(5000);
        t2.start();
        Thread.sleep(5000);
        t3.start();
		
	}
}
