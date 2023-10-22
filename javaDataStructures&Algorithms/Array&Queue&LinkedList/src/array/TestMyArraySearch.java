package array;

import array.util.*;

public class TestMyArraySearch {

	public static void main(String[] args) {
		MyArray ma=new MyArray();
		ma.add(2);
		ma.add(3);
		ma.add(35);
		ma.add(34);
		ma.add(12);
		ma.show();
		int index1=ma.search(34);
		System.out.println(index1);
		int index2=ma.binarySearch(35);
		System.out.println(index2);
	}

}
