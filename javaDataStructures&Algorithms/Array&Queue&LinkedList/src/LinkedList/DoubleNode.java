package LinkedList;

public class DoubleNode {
	
	//上一个节点
	DoubleNode pre=this;
	//下一个节点
	DoubleNode next=this;
	//节点内容
	int data;
	
	//构造方法
	public DoubleNode(int data) {
		this.data=data;
	}
	
	//当前节点后插入节点
	public DoubleNode insert(DoubleNode node) {
		this.next.pre=node;
		node.next=this.next;
		node.pre=this;
		this.next=node;
		return node;
	}
	//删除当前节点下一个节点
	public void removeNext() {
		this.next.next.pre=this;
		this.next=this.next.next;
	}
	
	//下一个节点
	public DoubleNode next() {
		return this.next;
	}
	
	//上一个节点
	public DoubleNode pre() {
		return this.pre();
	}
	
	//获取当前节点数据
	public int getData() {
		return this.data;
	}
}
