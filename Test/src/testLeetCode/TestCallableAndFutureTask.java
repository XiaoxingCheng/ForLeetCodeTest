package testLeetCode;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class TestCallableAndFutureTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callable<Object> callable =  new MyThread<Object>();
		FutureTask<Object> futureTask = new FutureTask<Object>(callable);
		Thread thread = new Thread(futureTask);
		thread.start();
	}
	public static class MyThread<Object> implements Callable<Object>{
		@Override
		public Object call() throws Exception{
			System.out.println("Test Test");
			return null;
		}
	}
}
