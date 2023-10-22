package 交换排序;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr=new int[] {13,24,35,4,2,12,1};
		BubbleSort(arr);
	}
	
	//冒泡排序
	/**
	 * 除最后一个，每个数字都要比较一轮， 共需要比较length-1轮
	 * 每一轮都要比较length-1-i次，每次更大的数字占据后位和下一个比较
	 * @param arr
	 */
	public static void BubbleSort(int[] arr) {
		//用于交换的中间变量
		int exc;
		//控制比较多少轮
		for(int i=0;i<arr.length-1;i++) {
			//控制一轮比较多少次
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
	
