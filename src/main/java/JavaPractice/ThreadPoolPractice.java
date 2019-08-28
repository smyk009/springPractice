package JavaPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolPractice {
public static void main(String[] args) {
	ExecutorService executorService = Executors.newFixedThreadPool(1);
	for(int i=0; i<100; i++) {
		executorService.submit(new Task(i));
		executorService.execute(new Task(i));
		executorService.submit(new Task(i));
		executorService.submit(new Task(i));
		executorService.submit(new Task(i));
		executorService.submit(new Task(i));
		executorService.submit(new Task(i));
		executorService.submit(new Task(i));
		executorService.submit(new Task(i));
		executorService.submit(new Task(i));
		executorService.submit(new Task(i));
		executorService.submit(new Task(i));
		executorService.submit(new Task(i));
		executorService.submit(new Task(i));
		executorService.submit(new Task(i));
		executorService.submit(new Task(i));
	}
}
}

final class Task implements Runnable {
	private int id;

	public Task(int id) {
		this.id = id;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("TaskId: " +id+" Performed By: "+ Thread.currentThread().getName());
	}
}
