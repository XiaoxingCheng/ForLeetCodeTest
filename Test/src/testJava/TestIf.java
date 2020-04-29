package testJava;

import java.util.Scanner;

public class TestIf {

	public static void main(String[] args) {
		int a = 12;
		int b = 12;
		System.out.println(a == b);//true
		String aa = "ab";
		String bb = "ab";
		System.out.println(aa==bb);//true
		System.out.println(aa.equals(bb));//true
		String aaa = new String("ab");
		String bbb = new String("ab");
		System.out.println(aaa==bbb);//false
		System.out.println(aaa.equals(bbb));//true
		int m = 1;
		int n = 0;
		System.out.println(m^n);
	}

}