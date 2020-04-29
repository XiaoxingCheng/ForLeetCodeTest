package testLeetCode;

public class TestStringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试用例
		/*
		 * null、""、.1、+1、-1、and word 694、694 and、-694 adn
		 */
		String str = "9223372036854775808";
		int res = myAtoi(str);
		System.out.println(res);
	}

	public static int myAtoi(String str) {
	 str = str.trim();
	 if(str==null||str.isEmpty()) return 0;
	 char t = str.charAt(0);
	 boolean flag = true;
	 double res = 0;//这里务必得用double
	 if(t=='-') {
		 flag = false;
	 }else {
		 if(t=='+') {
			 flag = true;
		 }else if(t-'0'>=0&&t-'0'<=9){
			 res = t-'0';
		 }else {
			 return 0;
		 }
	 }
	 for(int i=1;i<str.length();i++) {
		 int c = str.charAt(i)-'0';
		 if(c>=0&&c<=9) {
			 res=res*10+c;
		 }else {
			 break;
		 }
	 }
	 if(!flag) {
		 res = -res;
	 }
	 if(res >Integer.MAX_VALUE) {
		 return Integer.MAX_VALUE;
	 }
	 if(res<Integer.MIN_VALUE) {
		 return Integer.MIN_VALUE;
	 }
	 return (int)res;
	}

}
