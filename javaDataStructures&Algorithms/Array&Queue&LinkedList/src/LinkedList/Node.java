package LinkedList;

public class Node {
	//节点内容
	int data;
	//下一个节点
	Node next;
	
	//构造方法
	public Node(int data) {
		this.data=data;
	}
	
	//为节点无限追加节点
	public Node append(Node node) {
		//当前节点
		Node currentNode=this;
		//循环向后找
		while(currentNode.next!=null) {
			currentNode =currentNode.next;
		}
		//追加节点到当前末尾节点上
		currentNode.next=node;
		//把自己返回让追加函数更好写,eg：n1.append(n2).append(n3);
		return this;
	}
	
	//获取下一个节点
	public Node next() {
		return this.next;
	}
	
	//删除下一个节点
	public void removeNext() {
		this.next=this.next.next;
	}
	
	//当前节点后面插入一个节点
	public void insert(Node node) {
		node.next=this.next;
		this.next=node;
	}
	
	//显示所有节点信息
	public void show() {
		Node currentNode=this;
		while(currentNode!=null) {
			System.out.print(currentNode.data+" ");
			currentNode =currentNode.next;
		}
	}
	//获取节点中的数据
	public int getData() {
		return this.data;
	}
	
	//当前节点是否是最后一个节点
	public boolean isLast() {
		return next==null;
	}
}
