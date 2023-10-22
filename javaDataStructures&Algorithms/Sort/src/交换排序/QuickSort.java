package 交换排序;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr=new int[] {13,24,35,4,2,12,1};
		QuickSort(arr,0,arr.length-1);
		System.out.print(Arrays.toString(arr));
	}
	
	public static void QuickSort(int[] arr,int start,int end) {
		//注意约束条件，否则无限递归会栈溢出
		if(start<end) {
			//第0个作为标准数
			int standard=arr[start];
			//记录需要记录排序的坐标
			int low=start;
			int high=end;
			//低位与高位不重合时，循环找比标准数大的数和小的数，进行替换
			while(low<high) {
				//右边数大于标准数，不替换，下标向左移
				while(low<high&&standard<=arr[high]) {
					high--;
				}
				//右边数小于标准数，则去替换低位
				arr[low]=arr[high];
				//左边数小于标准数，不替换，下标向右移
				while(low<high&&standard>=arr[low]) {
					low++;
				}
				//左边数大于标准数，则去替换高位
				arr[high]=arr[low];
			}
			//标准数赋值给最后重叠的那一位
			arr[low]=standard;
			//递归处理左边区域
			QuickSort(arr,start,low);
			//递归处理右边区域
			QuickSort(arr,low+1,end);
		}
		
	}

}
