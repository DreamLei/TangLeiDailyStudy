package com.google.javase.day1and2work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SysConvert {
/*
 * ����һ��ʮ������M���Լ���Ҫת���Ľ�����N����ʮ������Mת��ΪN������ 
	��������:
	����Ϊһ�У�M(32λ����)��N(2 �� N �� 16)���Կո������
	Ϊÿ������ʵ�����ת���������ÿ�����ռһ�С�
	���N����9�����Ӧ�����ֹ���ο�16���ƣ����磬10��A��ʾ���ȵȣ�
 */
	private static String []a= {"0", "1", "2", "3", "4", "5", "6", "7", 
						 "8", "9", "A", "B", "C", "D", "E", "F"};
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String[] str = br.readLine().trim().split(" ");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        System.out.println(sysConvert(m,n));
	}
	public static String sysConvert(int m,int n) {
		  StringBuilder s = new StringBuilder();
		  if(m==0) {
			  return "0";
		  }
		  boolean f=m>0;
		  if(f) {
			 m=-m;
		  }
		while(m!=0) {
			s.insert(0,a[-(m%n)]);
			m/=n;
		}
		if(!f) {
			s.insert(0, "-");
		}
		return s.toString();
	}

}
