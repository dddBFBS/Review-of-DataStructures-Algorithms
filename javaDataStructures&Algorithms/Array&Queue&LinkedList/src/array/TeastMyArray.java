package array;

import array.util.*;
public class TeastMyArray {

	public static void main(String[] args) {
		//创建一个可变的数组
		MyArray ma=new MyArray();
		//获取长度
		int size=ma.size();
		ma.show();
		//往可变数组中添加元素
		ma.add(90);
		ma.add(28);
		ma.add(100);
		//显示元素
		ma.show();
		//删除某个元素
		ma.delete(1);
		ma.show();
		//取出指定位置的元素
		int element=ma.get(1);
		System.out.println(element);
		//指定位置插入元素
		ma.insert(1, 78);
		ma.show();
		//指定位置替换元素
		ma.set(0, 99);
		ma.show();
	}

}
