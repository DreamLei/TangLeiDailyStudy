package com.google.javase.day2andday3;

import java.util.Stack;
/*
 * ʵ��һ�������ջ��
 * ��ʵ��ջ�Ļ������ܵĻ����ϣ�
 * ��ʵ�ַ���ջ����СԪ�ص�
 * ��Ҫ��
 * 1��pop��push��getMin������ʱ�临�Ӷȶ���O(1)��
 * 2����Ƶ�ջ���Ϳ���ʹ���ֳɵ�ջ�ṹ��
 */
public class MinStack {
	private Stack <Integer> min=new Stack<Integer>();
	private Stack <Integer> stack=new Stack<Integer>();
	public void push(int i) {
		stack.push(i);
		min.push(min.isEmpty()||i<min.peek()?i:min.peek());

	}
	public int pop() {
		min.pop();
		return stack.pop();
	}
	public int getMin() {
		return min.pop();
	}
	
}
