package Day6;

import java.util.Scanner;
//����������
public class Array2Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//��������ֵ
		System.out.print("������һ��������"+"\t");
		int n = sc.nextInt();
		
		//�����ά����
		int[][] arr = new int[n][n];
		
		//��ÿ�е�һ�������һ��ֵ����
		for(int x=0;x<arr.length;x++){
			arr[x][0] = 1;
			arr[x][x] = 1;
		}
		
		//����ÿ�е�ֵ
		for(int x=2;x<arr.length;x++){
			for(int y=1;y<=x-1;y++){
				arr[x][y] = arr[x-1][y-1] + arr[x-1][y];
			}
		}
		//������ά����
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<=x;y++){
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
