package com.maxm.algo.sort;

public class Sort {
	// 排序俩有序集合
	public static int[] mergeSort(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];

		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}
		}

		while (i < a.length) {
			c[k++] = a[i++];
		}
		while (j < b.length) {
			c[k++] = b[j++];
		}

		return c;
	}

	// FIXME
	public static int[] insertSort(int[] data) {
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 6 };
		int[] b = { 2, 4, 5 };
		int[] sort = mergeSort(a, b);
		for (int i : sort) {
			System.out.println(i);
		}
	}
}
