package 归并排序;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int[] {1,3,5,2,4,6,8,10};
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	//归并排序，利用递归思想，最底层是划分成只有一个元素
	public static void mergeSort(int[] arr, int low,int high) {
		//递归结束条件
		if(low<high) {
			int mid=(high+low)/2;
			//处理左边
			mergeSort(arr,low,mid);
			//处理右边
			mergeSort(arr,mid+1,high);
			//归并
			merge(arr,low,mid,high);
		}
	}
	//归并 （mid是切割位置）
	public static void merge(int[] arr,int low,int mid, int high) {
		//存储归并后的临时数组
		int[] tmp =new int[high-low+1];
		//需要两个记录下标的数字（类比指针）
		int i=low;
		int j=mid+1;
		//在临时数组中存好的下标
		int index =0;
		//遍历两个数组取出小的数字，放入临时数组
		while(i<=mid&&j<=high) {
			if(arr[i]<arr[j]) {
				tmp[index]=arr[i];
				i++;
			}else {
				tmp[index]=arr[j];
				j++;
			}
			index++;
		}
		//处理多余数据
		while(j<=high) {
			tmp[index]=arr[j];
			j++;
			index++;
		}
		while(i<=mid) {
			tmp[index]=arr[i];
			i++;
			index++;
		}
		//临时数组数据按顺序写入原数组,注意，应该从最低位low开始放，因为这里从low开始归并
		for(int k=0;k<tmp.length;k++) {
			arr[low+k]=tmp[k];
		}
	}
}
