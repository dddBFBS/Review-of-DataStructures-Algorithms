package LinkedList;

public class LoopNode {
		//�ڵ�����
		int data;
		//��һ���ڵ㣬���ֻ��һ���ڵ㣬ָ���Լ�
		LoopNode next=this;
		
		//���췽��
		public LoopNode(int data) {
			this.data=data;
		}
		
		//��ȡ��һ���ڵ�
		public LoopNode next() {
			return this.next;
		}
		
		//ɾ����һ���ڵ�
		public void removeNext() {
			this.next=this.next.next;
		}
		
		//��ǰ�ڵ�������һ���ڵ�
		public LoopNode insert(LoopNode node) {
			node.next=this.next;
			this.next=node;
			return node;
		}
		
		//��ȡ�ڵ��е�����
		public int getData() {
			return this.data;
		}
		
}
