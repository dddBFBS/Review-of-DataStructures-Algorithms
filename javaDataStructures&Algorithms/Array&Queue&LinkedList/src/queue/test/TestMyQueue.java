package queue.test;

import queue.MyQueue;
public class TestMyQueue {

	public static void main(String[] args) {
		//����һ������
		MyQueue mq=new MyQueue();
		//���
		mq.add(0);
		mq.add(2);
		mq.add(4);
		mq.add(3);
		//����
		System.out.println(mq.poll());
		mq.add(6);//�ȳ���or�����Ԫ�ز�Ӱ�����˳��
		System.out.println(mq.poll());
		System.out.println(mq.poll());
		
		System.out.println(mq.poll());
		System.out.println(mq.poll());
		
	}

}
