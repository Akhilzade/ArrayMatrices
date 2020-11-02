package com.Array;

public class SecondArray {
	
//	static int[] get() {
//	
//	return new int[] {10,20,30,40,50};
//}
//
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//
//	int arr[]=get();
//	
//	for(int i=0; i<arr.length; i++ ) {
//		
//		System.out.println(arr[i]);
//	}

	
//public void printway(int arr[]) {
//	
//       for(int i=0; i<arr.length; i++) {
//    	   
//    	   System.out.println(i);
//       }
//	
//	}
//	
//public static void main(String[] args) {
//	
//	SecondArray s=new SecondArray();
//	s.printway(new int[]{10,20,30,40});
//	
//}





static void min(int arr[]) {

	int min = arr[0];

	for (int i = 1; i < arr.length; i++)

		if (min > arr[i])
			min = arr[i];

	System.out.println(min);
}

public static void main(String args[]) {

	int a[] = { 33, 3, 4, 5, 22 };
	
	min(a);
		
}
}