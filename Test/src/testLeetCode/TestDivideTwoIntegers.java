package testLeetCode;

public class TestDivideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 7, divisor = -3;
		int res = divide(dividend, divisor);
		System.out.println(res);
	}

	// ���
	public static int divide(int dividend, int divisor) {
		if (divisor == 0)
			return Integer.MAX_VALUE;
		if (dividend == Integer.MIN_VALUE && divisor == -1)
			return ~dividend;
		long dividend1 = Math.abs((long) dividend);
		long divisor1 = Math.abs((long) divisor);
		long sum = 0;
		long pow = 0;
		long result = 0;
		while (dividend1 >= divisor1) {
			pow = 1;
			sum = divisor1;
			while (sum + sum <= dividend1) {
				sum += sum;
				pow += pow;
			}
			dividend1 -= sum;
			result += pow;
		}
		if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
			return result > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) result;
		} else {
			return -result < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int) -result;
		}
	}
	// ���ƺ�����
//	public static int divide(int dividend,int divisor) {
//		if(divisor == 0) return Integer.MAX_VALUE;
//		if(dividend == Integer.MIN_VALUE&&divisor == -1)return ~dividend;
//		long dividend1 = Math.abs((long)dividend);
//		long divisor1 = Math.abs((long)divisor);
//		long result = 0;
//		while(dividend1>=divisor) {
//			int shiftnum = 0;
//			while(dividend1>=divisor<<shiftnum) {
//				shiftnum++;
//			}
//			result +=1<<(shiftnum-1);
//			dividend1-=divisor<<(shiftnum-1);
//		}
//		if((dividend>0&&divisor>0)||(dividend<0&&divisor<0)) {
//			return result>Integer.MAX_VALUE?Integer.MAX_VALUE:(int)result;
//		}else {
//			return -result<Integer.MIN_VALUE?Integer.MIN_VALUE:(int)-result;
//		}
//		
//	}
	/*
	 * public static int divide(int dividend, int divisor){ int result=0; if(divisor
	 * == 0) //����Ϊ0���������ֵ return Integer.MAX_VALUE; if(dividend == Integer.MIN_VALUE
	 * && divisor == -1){ return ~dividend; } long dividend1 =
	 * Math.abs((long)dividend); long divisor1 = Math.abs((long)divisor);
	 * 
	 * while(dividend1 >= divisor1)//�����������ڳ���ʱ������λ�Ʋ��� { int shiftnum = 0;
	 * while(dividend1 >= divisor1<<shiftnum){ shiftnum++;//��¼���ƴ�������ʵ�ʴ�����1�� } result
	 * += 1<<(shiftnum-1); dividend1 -= divisor1<<(shiftnum-1);//���±�������ֵ }
	 * if((dividend>0 && divisor>0)||(dividend<0 && divisor<0))//���������� return
	 * result; else return -result; }
	 */

	/*
	 * public static int divide(int dividend, int divisor) { if(divisor ==0) return
	 * Integer.MAX_VALUE; if(dividend == -2147483648&&divisor==1) return dividend;
	 * if(dividend == -2147483648&&divisor==-1) return Integer.MAX_VALUE; long
	 * dividendLong = Math.abs(dividend); long divisorLong =
	 * divisor<0?-divisor:divisor; long count = 1; int flag = (dividend ^ divisor);
	 * long temp = 0; while((dividendLong-temp) > divisorLong) { temp +=
	 * (divisorLong<<1); count=count<<1; } if(flag <0) { count = -count; }
	 * if(count>Integer.MAX_VALUE) { return Integer.MAX_VALUE; }
	 * if(count<Integer.MIN_VALUE) { return Integer.MIN_VALUE; } return (int)count;
	 * }
	 */
	// ��ʱ
	/*
	 * public static int divide(int dividend, int divisor) { if (divisor == 0)
	 * return Integer.MAX_VALUE; long count = 0; long dividendLong = dividend; long
	 * divisorLong = divisor; long flag = (dividendLong ^ divisorLong); //
	 * �����Integer.Min_Value����ԭֵ long t = dividendLong < 0 ? -dividendLong :
	 * dividendLong; long m = divisorLong < 0 ? -divisorLong : divisorLong; while (t
	 * >= m) { t -= m; count++; } if(flag<0) { count = -count; }
	 * if(count>Integer.MAX_VALUE) { return Integer.MAX_VALUE; }
	 * if(count<Integer.MIN_VALUE) { return Integer.MIN_VALUE; } return (int) count;
	 * }
	 */
}
