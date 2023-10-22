package recursive;

public class TestHanoi {

	public static void main(String[] args) {
		hanoi(3,'A','B','C');
	}

//	��n�����ӣ���from��ʼ�� ����in�м��� �ƶ���toĿ����
	public static void hanoi(int n,char from,char in,char to) {
		if(n==1) {
			System.out.println("��"+n+"�����Ӵ�"+from+"�Ƶ�"+to);
		}else {
		//���۶��ٸ����Ӷ�ֻ��Ϊ������������������һ����������Ϊһ��
			
			//����������Ƶ��м�
			hanoi(n-1,from,to,in);
			//�ƶ����������
			System.out.println("��"+n+"�����Ӵ�"+from+"�Ƶ�"+to);
			//����������Ӵ��м�λ���Ƶ�Ŀ��λ��
			hanoi(n-1,in,from,to);
		}
	}
}
