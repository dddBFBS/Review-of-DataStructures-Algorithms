package array.util;

import java.util.Arrays;

public class MyArray {

	//用于存储数据的数组
	private int[] elements;
	
	public MyArray() {
		elements=new int[0];
	}
	
	//获取数组长度的方法
	public int size() {
		return elements.length;
	}
	
	//往数组末尾添加一个元素
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
	
	//打印所有元素到控制台
	public void show() {
		System.out.println(Arrays.toString(elements));
	}
	
	//删除数组中的元素
	public void delete(int index) {
		//判断下表是否越界
		if(index<0 || index>=elements.length) {
			throw new RuntimeException("下标越界");
		}
		//创建一个新的数组，长度为原数组的长度-1
		int[] newArr = new int[elements.length-1];
		//复制原有数据到新数组
		for(int i=0;i<newArr.length;i++) {
			//想删除的元素前面的元素
			if(i<index) {
				newArr[i]=elements[i];
			//从要删除元素开始的位置放入想删除元素后面的元素
			}else {
				newArr[i]=elements[i+1];
			}
		}
		//新数组替换旧数组
		elements=newArr;
	}
	
	//插入一个元素到指定位置
	public void insert(int index,int element) {
		//创建一个新的数组
		int[] newArr=new int[elements.length+1];
		//将原数组中元素放入新数组中
		for(int i=0;i<=elements.length;i++) {
			//插入位置前的元素
			if(i<index) {
				newArr[i]=elements[i];
			//待插入位置	
			}else if(i==index) {
				newArr[i]=element;
			//插入位置后的元素
			}else {
				newArr[i]=elements[i-1];
			}
		}
		//旧数组替换原数组
		elements=newArr;
	}
	
	//替换指定位置的元素
	public void set(int index,int element) {
		elements[index]=element;
	}
	
	//获取某个元素
	public int get(int index) {
		return elements[index];
	}
	
	//线性查找
	public int search(int target) {
		//遍历数组
		for(int i=0;i<elements.length;i++) {
			if(elements[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	//二分查找
	public int binarySearch(int target) {
		int l=0;
		int r=elements.length-1;
		int mid=l+(r-l)/2;//avoid overflow
		int index=-1;
		while(l<=r) {
			if(elements[mid]==target) {
				index=mid;
				//System.out.println("index:"+index);
				break;
			}else if(elements[mid]<target) {
				l=mid+1;
			}else {
				r=mid-1;
			}
			mid=l+(r-l)/2;
		}
		return index;
	}
}
