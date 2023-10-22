package 插入排序;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int[] arr=new int[]{1,3,2,7,5,4};
		shellSort(arr);
		System.out.print(Arrays.toString(arr));

	}
	//比直接插入排序效率更高，因为已经先大致把小的放在左，大的放在右
	public static void shellSort(int[] arr) {
		//遍历所有步长，直至步长为0
		for(int d=arr.length/2;d>0;d/=2) {
			//遍历所有元素
			for(int i=d;i<arr.length;i++) {
				//遍历本组所有元素，故每次跨度d
				for(int j=i-d;j>0;j-=d ) {
					//如果当前元素大于加上步长后的那个元素
					if(arr[j]>arr[j+d]) {
						int temp=arr[j];
						arr[j]=arr[j+d];
						arr[j+d]=temp;
					}
				}
			}
		}
	}
}
