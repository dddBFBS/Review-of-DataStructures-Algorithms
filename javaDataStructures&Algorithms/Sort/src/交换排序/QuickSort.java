package ��������;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr=new int[] {13,24,35,4,2,12,1};
		QuickSort(arr,0,arr.length-1);
		System.out.print(Arrays.toString(arr));
	}
	
	public static void QuickSort(int[] arr,int start,int end) {
		//ע��Լ���������������޵ݹ��ջ���
		if(start<end) {
			//��0����Ϊ��׼��
			int standard=arr[start];
			//��¼��Ҫ��¼���������
			int low=start;
			int high=end;
			//��λ���λ���غ�ʱ��ѭ���ұȱ�׼���������С�����������滻
			while(low<high) {
				//�ұ������ڱ�׼�������滻���±�������
				while(low<high&&standard<=arr[high]) {
					high--;
				}
				//�ұ���С�ڱ�׼������ȥ�滻��λ
				arr[low]=arr[high];
				//�����С�ڱ�׼�������滻���±�������
				while(low<high&&standard>=arr[low]) {
					low++;
				}
				//��������ڱ�׼������ȥ�滻��λ
				arr[high]=arr[low];
			}
			//��׼����ֵ������ص�����һλ
			arr[low]=standard;
			//�ݹ鴦���������
			QuickSort(arr,start,low);
			//�ݹ鴦���ұ�����
			QuickSort(arr,low+1,end);
		}
		
	}

}
