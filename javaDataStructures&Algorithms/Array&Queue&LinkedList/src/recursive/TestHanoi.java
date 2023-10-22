package recursive;

public class TestHanoi {

	public static void main(String[] args) {
		hanoi(3,'A','B','C');
	}

//	把n个盘子，从from开始柱 借助in中间柱 移动到to目标柱
	public static void hanoi(int n,char from,char in,char to) {
		if(n==1) {
			System.out.println("第"+n+"个盘子从"+from+"移到"+to);
		}else {
		//无论多少个盘子都只认为有两个，上面所有是一个，最下面为一个
			
			//上面的盘子移到中间
			hanoi(n-1,from,to,in);
			//移动下面的盘子
			System.out.println("第"+n+"个盘子从"+from+"移到"+to);
			//把上面的盘子从中间位置移到目标位置
			hanoi(n-1,in,from,to);
		}
	}
}
