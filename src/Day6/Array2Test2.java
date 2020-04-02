package Day6;

import java.util.Scanner;
//输出杨辉三角
public class Array2Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//输入任意值
		System.out.print("请输入一个整数："+"\t");
		int n = sc.nextInt();
		
		//定义二维数组
		int[][] arr = new int[n][n];
		
		//给每行第一个和最后一个值复制
		for(int x=0;x<arr.length;x++){
			arr[x][0] = 1;
			arr[x][x] = 1;
		}
		
		//计算每行的值
		for(int x=2;x<arr.length;x++){
			for(int y=1;y<=x-1;y++){
				arr[x][y] = arr[x-1][y-1] + arr[x-1][y];
			}
		}
		//遍历二维数组
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<=x;y++){
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
