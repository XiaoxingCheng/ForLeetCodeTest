package testLeetCode;

import java.util.Arrays;

public class TestMergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 58, 48, 69, 87, 49, 59, 25, 35, 68, 48 };
		MergeSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

	public static void MergeSort(int[] a, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;// ���м仮������������
			MergeSort(a, low, mid);// ����������н��еݹ�����
			MergeSort(a, mid + 1, high);// ���Ҳ������н��еݹ�����
			merge(a, low, mid, high);// �鲢
		}
	}

	public static void merge(int[] a, int low, int mid, int high) {
		int[] b = new int[a.length + 1];
		for (int k = low; k <= high; k++) {
			b[k] = a[k];// ��a�е�����Ԫ�ظ��Ƶ�b
		}
		int i = low;
		int j = mid + 1;
		int k = low;
		// �Ƚ�b�е����������е�Ԫ��
		//a[low,mid],a[mid+1,high]
		for (; i <= mid && j <= high; k++) {
			if (b[i] <= b[j]) {
				a[k] = b[i++];
			} else {
				a[k] = b[j++];
			}
		}
		while (i <= mid)
			a[k++] = b[i++];
		while (j <= high)
			a[k++] = b[j++];
	}

}
