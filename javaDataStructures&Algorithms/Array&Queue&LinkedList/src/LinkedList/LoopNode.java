package LinkedList;

public class LoopNode {
		//节点内容
		int data;
		//下一个节点，如果只有一个节点，指向自己
		LoopNode next=this;
		
		//构造方法
		public LoopNode(int data) {
			this.data=data;
		}
		
		//获取下一个节点
		public LoopNode next() {
			return this.next;
		}
		
		//删除下一个节点
		public void removeNext() {
			this.next=this.next.next;
		}
		
		//当前节点后面插入一个节点
		public LoopNode insert(LoopNode node) {
			node.next=this.next;
			this.next=node;
			return node;
		}
		
		//获取节点中的数据
		public int getData() {
			return this.data;
		}
		
}
