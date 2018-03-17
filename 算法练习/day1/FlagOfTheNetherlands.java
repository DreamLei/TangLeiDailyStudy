package com.google.javase.day1;
/*
 * ������������������⣩
	����һ������arr����һ����num�����С��num�������������
	��ߣ�����num��������������м䣬����num�������������
	�ұߡ�
	Ҫ�����ռ临�Ӷ�O(1)��ʱ�临�Ӷ�O(N)
 */
public class FlagOfTheNetherlands {

	public static void main(String[] args) {
		int []arr={1,3,4,2,5,4,6};
		int num=4;
		flagOfTheNetherlands(arr,num);
		for(int i=0;i<arr.length;++i) {
			System.out.println(arr[i]);
		}
	}

	public static void flagOfTheNetherlands(int[] arr, int num) {
		for(int less=0,more=arr.length-1,i=0;more>=i;) {
			if(arr[i]>num) {
				swap(arr,i,more--);
				
			}
			else {
				if(arr[i]<num) {
					swap(arr,i,less++);
					
				}
				i++;
			}
		}
	}
	private static void swap(int[] arr, int i, int j) {
		int zjz;
		zjz=arr[j];
		arr[j]=arr[i];
		arr[i]=zjz;
	}
}