package Day5;

import java.util.Scanner;

public class ArrayTest4 {
	public static void main(String[] args) {
		String[] arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日",};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个数（0~6）：");
		int a = sc.nextInt();
		System.out.println("对应得星期是："+arr[a-1]);
	}
}
