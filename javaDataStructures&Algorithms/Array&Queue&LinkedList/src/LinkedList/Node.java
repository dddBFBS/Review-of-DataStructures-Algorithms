package LinkedList;

public class Node {
	//�ڵ�����
	int data;
	//��һ���ڵ�
	Node next;
	
	//���췽��
	public Node(int data) {
		this.data=data;
	}
	
	//Ϊ�ڵ�����׷�ӽڵ�
	public Node append(Node node) {
		//��ǰ�ڵ�
		Node currentNode=this;
		//ѭ�������
		while(currentNode.next!=null) {
			currentNode =currentNode.next;
		}
		//׷�ӽڵ㵽��ǰĩβ�ڵ���
		currentNode.next=node;
		//���Լ�������׷�Ӻ�������д,eg��n1.append(n2).append(n3);
		return this;
	}
	
	//��ȡ��һ���ڵ�
	public Node next() {
		return this.next;
	}
	
	//ɾ����һ���ڵ�
	public void removeNext() {
		this.next=this.next.next;
	}
	
	//��ǰ�ڵ�������һ���ڵ�
	public void insert(Node node) {
		node.next=this.next;
		this.next=node;
	}
	
	//��ʾ���нڵ���Ϣ
	public void show() {
		Node currentNode=this;
		while(currentNode!=null) {
			System.out.print(currentNode.data+" ");
			currentNode =currentNode.next;
		}
	}
	//��ȡ�ڵ��е�����
	public int getData() {
		return this.data;
	}
	
	//��ǰ�ڵ��Ƿ������һ���ڵ�
	public boolean isLast() {
		return next==null;
	}
}
