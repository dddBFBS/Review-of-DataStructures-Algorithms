package ��������;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] arr=new int[] {13,24,35,4,2,12,1};
		InsertSort(arr);
		System.out.print(Arrays.toString(arr));

	}
	
	public static void InsertSort(int[] arr) {
		//��������������ź���ģ��ұߵ�������ź���Ĳ�����嵽���ʵ�λ��
		//�������е�����
		for(int i=1;i<arr.length;i++) {
			//�����ǰ���ֱ�ǰһ������С
			if(arr[i]<arr[i-1]) {
				//�ѵ�ǰ�������ִ�����
				int temp=arr[i];
				//������ǰ����ǰ�����е����֣�ʵ��temp������ȷ��λ��
				int j;
				for(j=i-1;j>=0&&arr[j]>temp;j--) {
					//��ǰһ�����ָ�����һ������
					arr[j+1]=arr[j];
				}
				//�����forѭ���ĵ�ǰԪ�ظ��������������ĺ�һ��Ԫ��
				arr[j+1]=temp;
			}
		}
	}

}
