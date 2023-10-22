package queue;

public class MyQueue {
	int[] elements;
	
	public MyQueue() {
		elements = new int[0];
	}
	//入队
	public void add(int element) {
		//必须创建一个新的数组
		int[] newArr=new int[elements.length+1];
		//把原数组内容复制到新数组中
		for(int i=0;i<elements.length;i++) {
					newArr[i]=elements[i];
		}
		//把添加的元素放入新数组中
		newArr[elements.length]=element;
		//使用新数组替换旧数组
		elements=newArr;
	}
	//出队
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
