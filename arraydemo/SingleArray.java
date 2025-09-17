package com.tnsif.arraydemo;

public class SingleArray {
	public static void main(String[]args) {
		int[] arr;
		
	int[] arr1= {1,2,3,4};
	System.out.println("using enhanced forloop");
	for(int num:arr1) {
		System.out.println("The array elements are"+num);
	}
	int[] num=new int[5];
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	num[4]=50;
	System.out.println("using forloop");
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
	}
	}
}
