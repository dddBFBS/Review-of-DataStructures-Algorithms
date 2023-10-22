package stack;

public class MyStack {
	
	//栈的底层我们使用数组来存储数据
	int[] elements;
	
	public MyStack() {
		elements = new int[0];
	}
	//查看栈是否为空
	public boolean isEmpty() {
		return elements.length==0;
	}
	
	//压入元素
	public void push(int element) {
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
	//查看栈顶元素
	public int peek() {
		return elements[elements.length-1];
	}
	//取出栈顶元素
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
