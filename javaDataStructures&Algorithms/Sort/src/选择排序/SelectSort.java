package 选择排序;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		int[] arr=new int[] {1,3,2,7,5,4};
		selectSort(arr);
		System.out.print(Arrays.toString(arr));

	}
	//选择排序
	public static void selectSort(int[] arr) {
		//遍历所有数字
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			//每次遍历选择右边最小的数和minIndex位置进行交换
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
