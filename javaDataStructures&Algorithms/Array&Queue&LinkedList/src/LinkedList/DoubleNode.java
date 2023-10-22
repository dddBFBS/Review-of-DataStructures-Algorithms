package LinkedList;

public class DoubleNode {
	
	//��һ���ڵ�
	DoubleNode pre=this;
	//��һ���ڵ�
	DoubleNode next=this;
	//�ڵ�����
	int data;
	
	//���췽��
	public DoubleNode(int data) {
		this.data=data;
	}
	
	//��ǰ�ڵ�����ڵ�
	public DoubleNode insert(DoubleNode node) {
		this.next.pre=node;
		node.next=this.next;
		node.pre=this;
		this.next=node;
		return node;
	}
	//ɾ����ǰ�ڵ���һ���ڵ�
	public void removeNext() {
		this.next.next.pre=this;
		this.next=this.next.next;
	}
	
	//��һ���ڵ�
	public DoubleNode next() {
		return this.next;
	}
	
	//��һ���ڵ�
	public DoubleNode pre() {
		return this.pre();
	}
	
	//��ȡ��ǰ�ڵ�����
	public int getData() {
		return this.data;
	}
}
