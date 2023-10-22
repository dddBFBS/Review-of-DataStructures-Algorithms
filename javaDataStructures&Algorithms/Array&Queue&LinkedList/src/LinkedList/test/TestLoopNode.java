package LinkedList.test;

import LinkedList.LoopNode;

public class TestLoopNode {

	public static void main(String[] args) {
		//创建节点
		LoopNode n1=new LoopNode(1);
		LoopNode n2=new LoopNode(2);
		LoopNode n3=new LoopNode(3);
		LoopNode n4=new LoopNode(4);
		//追加节点
		n1.insert(n2).insert(n3).insert(n4);
		
		System.out.println(n1.next().next().getData());
			
		n2.removeNext();
		System.out.println(n1.next().next().getData());
	}

}
