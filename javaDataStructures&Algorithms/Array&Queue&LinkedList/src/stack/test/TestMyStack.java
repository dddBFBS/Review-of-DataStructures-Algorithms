package stack.test;

import stack.MyStack;
public class TestMyStack {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MyStack ms =new MyStack();
		ms.push(1);
		ms.push(23);
		ms.push(3);
		ms.push(2);
		ms.push(34);
		System.out.println(ms.peek());
		ms.pop();
		System.out.println(ms.peek());
	}

}
