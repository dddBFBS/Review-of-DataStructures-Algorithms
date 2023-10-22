package stack;

public class MyStack {
	
	//ջ�ĵײ�����ʹ���������洢����
	int[] elements;
	
	public MyStack() {
		elements = new int[0];
	}
	//�鿴ջ�Ƿ�Ϊ��
	public boolean isEmpty() {
		return elements.length==0;
	}
	
	//ѹ��Ԫ��
	public void push(int element) {
		//���봴��һ���µ�����
		int[] newArr=new int[elements.length+1];
		//��ԭ�������ݸ��Ƶ���������
		for(int i=0;i<elements.length;i++) {
					newArr[i]=elements[i];
		}
		//����ӵ�Ԫ�ط�����������
		newArr[elements.length]=element;
		//ʹ���������滻������
		elements=newArr;
	}
	//�鿴ջ��Ԫ��
	public int peek() {
		return elements[elements.length-1];
	}
	//ȡ��ջ��Ԫ��
	public int pop() {
		if(elements.length==0) {
			throw new RuntimeException("Empty!");
		}else {
			int[] newArr=new int[elements.length-1];
			for(int i=0;i<elements.length-1;i++) {
				newArr[i]=elements[i];
			}
			int peek=elements[elements.length-1];
			elements=newArr;
			return peek;
		}
		
	}
}
