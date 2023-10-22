package queue.test;

import queue.MyQueue;
public class TestMyQueue {

	public static void main(String[] args) {
		//创建一个队列
		MyQueue mq=new MyQueue();
		//入队
		mq.add(0);
		mq.add(2);
		mq.add(4);
		mq.add(3);
		//出队
		System.out.println(mq.poll());
		mq.add(6);//先出队or先入该元素不影响出队顺序
		System.out.println(mq.poll());
		System.out.println(mq.poll());
		
		System.out.println(mq.poll());
		System.out.println(mq.poll());
		
	}

}
