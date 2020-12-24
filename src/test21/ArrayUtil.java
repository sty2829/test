package test21;

public class ArrayUtil {
	
	static int[] add(int[] arr,int num) {
		int[] tmp = arr;
		arr = new int[arr.length+1];
		for(int i=0; i<tmp.length; i++) {
			arr[i] = tmp[i];
		}
		arr[arr.length-1] = num;
		return arr;
	}
	
	static String[] add(String[] arr,String str) {
		String[] tmp = arr;
		arr = new String[arr.length+1];
		for(int i=0; i<tmp.length; i++) {
			arr[i] = tmp[i];
		}
		arr[arr.length-1] = str;
		return arr;
	}
	
	static double[] add(double[] arr, double db) {
		double[] tmp = arr;
		arr = new double[arr.length+1];
		for(int i=0; i<tmp.length; i++) {
			arr[i] = tmp[i];
		}
		arr[arr.length-1] = db;
		return arr;
	}
	
	static int[] remove(int[] arr) {
		int[] tmp = arr;
		arr = new int[arr.length-1];
		for(int i=0; i<arr.length; i++) {
			arr[i] = tmp[i];
		}
		return arr;
	}
	
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void printArray(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void printArray(double[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
