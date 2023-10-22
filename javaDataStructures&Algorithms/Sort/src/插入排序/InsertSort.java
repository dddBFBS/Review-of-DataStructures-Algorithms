package 插入排序;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] arr=new int[] {13,24,35,4,2,12,1};
		InsertSort(arr);
		System.out.print(Arrays.toString(arr));

	}
	
	public static void InsertSort(int[] arr) {
		//插入排序，左边是排好序的，右边的往左边排好序的部分里插到合适的位置
		//遍历所有的数字
		for(int i=1;i<arr.length;i++) {
			//如果当前数字比前一个数字小
			if(arr[i]<arr[i-1]) {
				//把当前遍历数字存起来
				int temp=arr[i];
				//遍历当前数字前面所有的数字，实现temp插入正确的位置
				int j;
				for(j=i-1;j>=0&&arr[j]>temp;j--) {
					//把前一个数字赋给后一个数字
					arr[j+1]=arr[j];
				}
				//把外层for循环的当前元素赋给不满足条件的后一个元素
				arr[j+1]=temp;
			}
		}
	}

}
