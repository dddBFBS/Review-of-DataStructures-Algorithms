package recursive;

public class TestFebonacci {

	public static void main(String[] args) {
		// 쳲��������У�1 1 2 3 5 8 13...ÿ����Ϊǰ����֮��
		int i=febonacci(4);
		//��ӡ������ĵ�i��
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
