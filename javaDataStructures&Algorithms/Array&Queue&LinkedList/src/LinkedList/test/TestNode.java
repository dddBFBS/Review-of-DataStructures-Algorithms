package LinkedList.test;
import LinkedList.*;

public class TestNode {

	public static void main(String[] args) {
		//�����ڵ�
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		
		//׷�ӽڵ�
		n1.append(n2).append(n3);
		//ȡ����һ���ڵ������
		//System.out.println(n1.next().next().getData());
		//�жϽڵ��Ƿ�Ϊ���һ���ڵ�
		//System.out.println(n1.isLast());
		
		n1.removeNext();
		n1.show();
		
		n1.insert(n4);
		n1.show();
	}

}
