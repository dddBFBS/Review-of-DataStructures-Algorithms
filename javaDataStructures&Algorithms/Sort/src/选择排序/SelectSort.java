package ѡ������;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		int[] arr=new int[] {1,3,2,7,5,4};
		selectSort(arr);
		System.out.print(Arrays.toString(arr));

	}
	//ѡ������
	public static void selectSort(int[] arr) {
		//������������
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			//ÿ�α���ѡ���ұ���С������minIndexλ�ý��н���
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}

}
