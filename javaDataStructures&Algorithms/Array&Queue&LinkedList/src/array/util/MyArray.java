package array.util;

import java.util.Arrays;

public class MyArray {

	//���ڴ洢���ݵ�����
	private int[] elements;
	
	public MyArray() {
		elements=new int[0];
	}
	
	//��ȡ���鳤�ȵķ���
	public int size() {
		return elements.length;
	}
	
	//������ĩβ���һ��Ԫ��
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
	
	//��ӡ����Ԫ�ص�����̨
	public void show() {
		System.out.println(Arrays.toString(elements));
	}
	
	//ɾ�������е�Ԫ��
	public void delete(int index) {
		//�ж��±��Ƿ�Խ��
		if(index<0 || index>=elements.length) {
			throw new RuntimeException("�±�Խ��");
		}
		//����һ���µ����飬����Ϊԭ����ĳ���-1
		int[] newArr = new int[elements.length-1];
		//����ԭ�����ݵ�������
		for(int i=0;i<newArr.length;i++) {
			//��ɾ����Ԫ��ǰ���Ԫ��
			if(i<index) {
				newArr[i]=elements[i];
			//��Ҫɾ��Ԫ�ؿ�ʼ��λ�÷�����ɾ��Ԫ�غ����Ԫ��
			}else {
				newArr[i]=elements[i+1];
			}
		}
		//�������滻������
		elements=newArr;
	}
	
	//����һ��Ԫ�ص�ָ��λ��
	public void insert(int index,int element) {
		//����һ���µ�����
		int[] newArr=new int[elements.length+1];
		//��ԭ������Ԫ�ط�����������
		for(int i=0;i<=elements.length;i++) {
			//����λ��ǰ��Ԫ��
			if(i<index) {
				newArr[i]=elements[i];
			//������λ��	
			}else if(i==index) {
				newArr[i]=element;
			//����λ�ú��Ԫ��
			}else {
				newArr[i]=elements[i-1];
			}
		}
		//�������滻ԭ����
		elements=newArr;
	}
	
	//�滻ָ��λ�õ�Ԫ��
	public void set(int index,int element) {
		elements[index]=element;
	}
	
	//��ȡĳ��Ԫ��
	public int get(int index) {
		return elements[index];
	}
	
	//���Բ���
	public int search(int target) {
		//��������
		for(int i=0;i<elements.length;i++) {
			if(elements[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	//���ֲ���
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
