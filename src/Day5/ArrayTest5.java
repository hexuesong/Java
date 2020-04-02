package Day5;

import java.util.Scanner;

public class ArrayTest5 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		requst(arr, a);
	}
	public static void requst(int[] arr,int value){
		for(int i=0;i<arr.length;i++){
			if(arr[i] == value){
				System.out.println(value+"的索引值是："+i);
			}else{
				System.out.println("请输入正确的数值！！！");
				break;
			}
		}
	}
}
