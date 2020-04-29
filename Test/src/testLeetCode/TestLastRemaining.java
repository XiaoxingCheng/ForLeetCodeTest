package testLeetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestLastRemaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5, m = 3;
		System.out.println(lastRemaining(n, m));
	}
	public static int lastRemaining(int n, int m) {
		if(n<1||m<1) return 0;
		int i =-1;
		int step = 0;
		int count = n;
		int[] num = new int[n];
		while(count >0) {
			i++;
			if(i>=n) {
				i =0;
			}
			if(num[i]==-1) {
				continue;
			}
			step++;
			if(step == m) {
				num[i]=-1;
				step =0;
				count--;
			}
		}
		return i;
	}
	/*
	 * public static int lastRemaining(int n, int m) { if (n < 1 || m < 1) return
	 * -1; List<Integer> list = new ArrayList<Integer>(); for (int i = 0; i < n;
	 * i++) { list.add(i); }
	 * 
	 * int current = 0; int curSize = n; Iterator<Integer> iterator =
	 * list.iterator(); while(curSize>1) { for(current =1;current<=m;current++) {
	 * if(iterator.hasNext()) { iterator.next(); }else { iterator = list.iterator();
	 * iterator.next(); } } iterator.remove(); curSize--; } iterator =
	 * list.iterator(); return iterator.next(); }
	 */

}