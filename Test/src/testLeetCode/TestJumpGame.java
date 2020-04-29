package testLeetCode;

public class TestJumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1 };
		boolean res = canJump(nums);
		System.out.println(res);
	}
	//̰��ʵ��
	public static boolean canJump(int[] nums) {
		if(nums==null||nums.length==0) return false;
		if(nums.length==1) return true;
		int max = 0;
		for(int i = 0;i<nums.length;i++) {
			if(i<=max) {
				max = Math.max(max, nums[i]+i);
				if(i>=nums.length-1) {
					return true;
				}
			}
		}
		return false;
	}
	//����˼����̰���㷨
//	public static boolean canJump(int[] nums) {
//		if(nums==null||nums.length==0) return false;
//		if(nums.length==1) return true;
//		int max = nums[0];//�Ҹо��˼�����뷨�ر��
//		//1.��ǰλ�ò��ܵ�����һ��λ�ã�����false
//		//2.����index�ܹ���������
//		for(int i=0;i<nums.length;i++) {
//			if(max<=i&&nums[i]==0) {
//				//��ǰλ�ò�������δ֪�����ܵ�����һλ��
//				return false;
//			}
//			//��ǰλ����Ծ��ֵ����
//			//���統ǰ��max��3����i=2,nums[i]=3;
//			//��max�������ֵ
//			if(i+nums[i]>=max) {
//				max = i+nums[i];
//			}
//			if(max>=nums.length-1) {
//				return true;
//			}
//		}
//		return false;
//	}
	//��ʱ����һ���Ͱ��յ�ǰλ�ü��ϵ�ǰλ�õ�����Ծ
//	public static boolean canJump(int[] nums) {
//		if (nums == null || nums.length == 0)
//			return false;
//		int len = nums.length;
//		int i = 0;
//		int cur = 0;
//		while (cur < len) {
//			cur = cur + nums[cur];
//			if (cur == len - 1) {
//				return true;
//			}
//		}
//		return false;
//	}

}