package com.maxm.algo.sort;


/**
 * 选择排序 复杂度： n^2<p>
 * 思想：找到最大元素放到最后位置，然后在子数组中选择最大值放入子数组最后位置
 */
public class SelectSort {

	public int[] sort(int[] source){
		int length = source.length;
		while(length>0){
			int maxIndex=length-1;
			for(int i=0;i<maxIndex;i++){
				if(source[i]>source[maxIndex]){
					maxIndex=i;
				}
			}
			
			if(maxIndex!=length-1){
				int now=source[length-1];
				source[length-1]=source[maxIndex];
				source[maxIndex]=now;
			}
			
			length--;
		}
		return source;
	}
	
	public static void main(String[] args) {
		SelectSort selectSort = new SelectSort();
		int[] source = {6, 2, 5, 4, 8};
		int[] sort = selectSort.sort(source);

		print(sort);
	}

	private static void print(int[] sort) {
		StringBuffer stringBuffer = new StringBuffer();
		for(int e : sort){
			stringBuffer.append(e).append(" ");
		}
		System.out.println(stringBuffer.toString());
	}
	
}
