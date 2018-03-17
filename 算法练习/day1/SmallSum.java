package com.google.javase.day1;
/*
 * С������
	��һ�������У�ÿһ������߱ȵ�ǰ��С�����ۼ�������������������С�͡���һ������
	��С�͡�
	���ӣ�
	[1,3,4,2,5]
	1��߱�1С������û�У�
	3��߱�3С������1��
	4��߱�4С������1��3��
	2��߱�2С������1��
	5��߱�5С������1��3��4��2��
	����С��Ϊ1+1+3+1+1+3+4+2=16
 */
public class SmallSum {

	public static void main(String[] args) {
		int sum;
		int a[]= {1,3,4,2,5};
		sum=smallSum(a,0,a.length-1);
		System.out.println(sum);

	}
/*
 * �������ã���С��
 * ��������������a left��߽�right�ұ�
 * ����ֵ��С��
 */
	public static int smallSum(int []a,int left,int right) {
		if(left==right) {
			return 0;
		}
		int mid;
		mid=(left+right)>>1;
		return smallSum(a,left,mid)+smallSum(a,mid+1,right)+mergeSum(a,left,mid,right);	
	}
/*
 * �������ã�������ģ��ϲ����С�Ͳ���������
 * ��������������a left��߽�right�ұ�mid�м����
 * ����ֵ���ϲ���ĺ�ֵ
 */
	public static int mergeSum(int[] a, int left, int mid, int right) {
		int help[]=new int[right-left+1];
		int sum=0,k=0;
		//�������ã�i��ߵ�����С��j�ұ������±�
		int i=left,j=mid+1;
		while(i<mid+1||j<right+1) {
			if(j==right+1||(i<mid+1&&a[i]<a[j])) {
				//�ұ�����û������
				if(j!=right+1) {
					sum+=(right+1-j)*a[i];
				}
				help[k++]=a[i++];
			}
			else {
				help[k++]=a[j++];
			}
		}
		for(i=0;i<help.length;++i) {
			a[i+left]=help[i];
		}
		return sum;
	}

}
