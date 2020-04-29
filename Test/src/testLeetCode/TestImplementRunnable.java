package testLeetCode;

public class TestImplementRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
	}
	public static class MyThread implements Runnable{
		@Override
		public void run(){
			System.out.println("This is MyThread");
		}
	}

}
