package ��������;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr=new int[] {13,24,35,4,2,12,1};
		BubbleSort(arr);
	}
	
	//ð������
	/**
	 * �����һ����ÿ�����ֶ�Ҫ�Ƚ�һ�֣� ����Ҫ�Ƚ�length-1��
	 * ÿһ�ֶ�Ҫ�Ƚ�length-1-i�Σ�ÿ�θ��������ռ�ݺ�λ����һ���Ƚ�
	 * @param arr
	 */
	public static void BubbleSort(int[] arr) {
		//���ڽ������м����
		int exc;
		//���ƱȽ϶�����
		for(int i=0;i<arr.length-1;i++) {
			//����һ�ֱȽ϶��ٴ�
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					exc=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=exc;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
	
