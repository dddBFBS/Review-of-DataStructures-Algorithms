package queue;

public class MyQueue {
	int[] elements;
	
	public MyQueue() {
		elements = new int[0];
	}
	//���
	public void add(int element) {
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
	//����
	public int poll() {
		if(elements.length==0) {
			throw new RuntimeException("Empty!");
		}else {
			int[] newArr=new int[elements.length-1];
			for(int i=0;i<elements.length-1;i++) {
				newArr[i]=elements[i+1];
			}
			int first=elements[0];
			elements=newArr;
			return first;
		}
		
	}
}
