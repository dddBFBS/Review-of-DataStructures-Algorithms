package LinkedList.test;

import LinkedList.DoubleNode;

public class TestDoubleNode {

	public static void main(String[] args) {
		//创建节点
		DoubleNode n1=new DoubleNode(1);
		DoubleNode n2=new DoubleNode(2);
		DoubleNode n3=new DoubleNode(3);
		
		n1.insert(n2).insert(n3);
		System.out.println(n1.next().getData());
		n1.insert(n3);
		System.out.println(n1.next().getData());
		n1.removeNext();
		System.out.println(n1.next().getData());
	}

}
