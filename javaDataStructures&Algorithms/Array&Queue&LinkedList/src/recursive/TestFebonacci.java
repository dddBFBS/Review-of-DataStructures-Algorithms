package recursive;

public class TestFebonacci {

	public static void main(String[] args) {
		// 斐波那契数列：1 1 2 3 5 8 13...每个数为前两项之和
		int i=febonacci(4);
		//打印数列里的第i项
		System.out.println(i);
	}
	
	public static int febonacci(int i) {
		if(i==1||i==2) {
			return 1;
		}else {
			return febonacci(i-1)+febonacci(i-2);
		}
	}

}
