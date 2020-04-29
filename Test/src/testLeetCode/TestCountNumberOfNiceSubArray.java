package testLeetCode;

import java.util.HashMap;

public class TestCountNumberOfNiceSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 2, 1, 1 };
		int k = 3;
		int res = numberOfSubarrays(nums, k);
		System.out.println(res);
	}

	public static int numberOfSubarrays(int[] nums, int k) {
		int left = 0, right = 0, oddCnt = 0, res = 0;
		while (right < nums.length) {
			// ��ָ�����ߣ�ÿ����һ�������� oddCnt++��
			if ((nums[right++] & 1) == 1) {
				oddCnt++;
			}

			// ����ǰ�������� [left, right) ���� k �������ˣ�����˷�֧ͳ�Ƶ�ǰ���������е����������������
			if (oddCnt == k) {
				// �Ƚ��������ڵ��ұ߽�������չ��ֱ��������һ������������磩
				// rightEvenCnt ��Ϊ�� k �������ұߵ�ż���ĸ���
				int tmp = right;
				while (right < nums.length && (nums[right] & 1) == 0) {
					right++;
				}
				int rightEvenCnt = right - tmp;
				// leftEvenCnt ��Ϊ�� 1 ��������ߵ�ż���ĸ���
				int leftEvenCnt = 0;
				while ((nums[left] & 1) == 0) {
					leftEvenCnt++;
					left++;
				}
				// �� 1 ��������ߵ� leftEvenCnt ��ż����������Ϊ��������������
				// (��Ϊ��1��������߿���1��ż������ȡ����������ѡ���� leftEvenCnt + 1 �֣�
				// �� k �������ұߵ� rightEvenCnt ��ż����������Ϊ������������յ�
				// (��Ϊ��k�������ұ߿���1��ż������ȡ�������յ��ѡ���� rightEvenCnt + 1 �֣�
				// ���Ըû��������У�������������������ѡ�������Ϊ (leftEvenCnt + 1) * (rightEvenCnt + 1)
				res += (leftEvenCnt + 1) * (rightEvenCnt + 1);

				// ��ʱ left ָ����ǵ� 1 ����������Ϊ�������Ѿ�ͳ�����ˣ���� left ����һλ��oddCnt--
				left++;
				oddCnt--;
			}

		}

		return res;
	}
//	public static int numberOfSubarrays(int[] nums, int k) {
//		int res = 0;
//		int sum = 0;
//		HashMap<Integer, Integer> map = new HashMap<>();
//		map.put(0, 1);
//		for (int i = 0; i < nums.length; i++) {
//			sum += (nums[i] % 2 == 1) ? 1 : 0;
//			map.put(sum, map.getOrDefault(sum, 0) + 1);
//			int t = sum - k;
//			res += map.getOrDefault(sum - k, 0);
//		}
//		return res;
//	}
}
