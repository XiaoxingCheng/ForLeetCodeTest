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
			int mid = (low + high) / 2;// 从中间划分两个自序列
			MergeSort(a, low, mid);// 对左侧子序列进行递归排序
			MergeSort(a, mid + 1, high);// 对右侧子序列进行递归排序
			merge(a, low, mid, high);// 归并
		}
	}

	public static void merge(int[] a, int low, int mid, int high) {
		int[] b = new int[a.length + 1];
		for (int k = low; k <= high; k++) {
			b[k] = a[k];// 将a中的所有元素复制到b
		}
		int i = low;
		int j = mid + 1;
		int k = low;
		// 比较b中的左右两段中的元素
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
