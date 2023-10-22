package array;

public class TestBinarySearch {

	public static void main(String[] args) {
		//target array
		int[] arr=new int[]{1,2,3,5,6,7,8};
		//target element
		int target=4;
		//position to start
		int l=0;
		//position to end
		int r=arr.length-1;
		//middle position
		int mid=l+(r-l)/2;//avoid overflow
		//initialize target position
		int index=-1;
		//search in loop
		while(l<=r) {
			if(arr[mid]==target) {
				index=mid;
				System.out.println("index:"+index);
				break;
			}else if(arr[mid]<target) {
				l=mid+1;
			}else {
				r=mid-1;
			}
			mid=l+(r-l)/2;
		}
		if(arr[mid]!=target) {
			System.out.println("failed:"+index);
	
		}
	}
}
