package array;

import array.util.*;
public class TeastMyArray {

	public static void main(String[] args) {
		//����һ���ɱ������
		MyArray ma=new MyArray();
		//��ȡ����
		int size=ma.size();
		ma.show();
		//���ɱ�����������Ԫ��
		ma.add(90);
		ma.add(28);
		ma.add(100);
		//��ʾԪ��
		ma.show();
		//ɾ��ĳ��Ԫ��
		ma.delete(1);
		ma.show();
		//ȡ��ָ��λ�õ�Ԫ��
		int element=ma.get(1);
		System.out.println(element);
		//ָ��λ�ò���Ԫ��
		ma.insert(1, 78);
		ma.show();
		//ָ��λ���滻Ԫ��
		ma.set(0, 99);
		ma.show();
	}

}