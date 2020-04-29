package testLeetCode;

import java.util.ArrayList;
import java.util.List;

public class TestThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		list.add(10);
		list.add(0);
		System.out.println(list);
		/*
		 * MyThread1 myThread1 = new MyThread1(); MyThread1 myThread2 = new MyThread1();
		 * myThread1.start(); myThread2.start();
		 */
	}

	public static class MyThread1 extends Thread {
		int i = 0;

		@Override
		public void run() {
			System.out.println("This is my Thread1" + (i++));
		}
	}
}
