package Day5;

import java.util.Scanner;

public class ArrayTest4 {
	public static void main(String[] args) {
		String[] arr = {"����һ","���ڶ�","������","������","������","������","������",};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ������0~6����");
		int a = sc.nextInt();
		System.out.println("��Ӧ�������ǣ�"+arr[a-1]);
	}
}
