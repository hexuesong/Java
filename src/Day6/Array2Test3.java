package Day6;

import java.util.Scanner;

public class Array2Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����������ǰ����(����)��");
		int a = sc.nextInt();
		//System.out.println((a+"").length());
	/*	int bit = (a+"").length();
		int[] arr = new int[bit];
		arr[0] = (a/100000)%10;
		arr[1] = (a/10000)%10;
		arr[2] = (a/1000)%10;
		arr[3] = (a/100)%10;
		arr[4] = (a/10)%10;
		arr[5] = a%10;
		//�����������ת�ɵ�������
		for(int x=0;x<bit;x++){
			arr[x]=(int) ((a/(Math.pow(10, x)))%10);
		}
		
		//�ڶ���ת�����鷽��
		int index = 0;
		while(a>0){
			arr[index] = a%10;
			index++;
			a/=10;
		}
		//���ڶ��ַ����Ľ�
		for(int i=0;i<bit;i++){
			arr[i]=a%10;
			a/=10;
		}
		
		//��ÿλ���ּ�5�����úͳ���10���������������
		for(int x=0;x<arr.length;x++){
			arr[x] = (arr[x]+5)%10;
		}
		
		//��������
		
		for(int start=0,end=arr.length-1;start<=end;start++,end--){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] =temp;
		}
		//����һλ�����һλ����
		int temp = arr[0];
		arr[0] = arr[bit-1];
		arr[bit-1] = temp;
		
		//�����ƴ�ӳ��ַ���
		String result = "";
		for(int i=0;i<arr.length;i++){
			result += arr[i];
		}
		System.out.println(result);
		
		//�����������
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}	
		*/
		
		System.out.println(jiaMI(a));
	}
	public static String jiaMI(int number) {
		// TODO Auto-generated method stub
		int bit = (number+"").length();
		int[] arr = new int[bit];
		/*arr[0] = (a/100000)%10;
		arr[1] = (a/10000)%10;
		arr[2] = (a/1000)%10;
		arr[3] = (a/100)%10;
		arr[4] = (a/10)%10;
		arr[5] = a%10;*/
		//�����������ת�ɵ�������
		/*for(int x=0;x<bit;x++){
			arr[x]=(int) ((a/(Math.pow(10, x)))%10);
		}*/
		
		//�ڶ���ת�����鷽��
	/*	int index = 0;
		while(a>0){
			arr[index] = a%10;
			index++;
			a/=10;
		}*/
		//���ڶ��ַ����Ľ�
		for(int i=0;i<bit;i++){
			arr[i]=number%10;
			number/=10;
		}
		
		//��ÿλ���ּ�5�����úͳ���10���������������
		for(int x=0;x<arr.length;x++){
			arr[x] = (arr[x]+5)%10;
		}
	/*	
		//��������
		
		for(int start=0,end=arr.length-1;start<=end;start++,end--){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] =temp;
		}*/
		//����һλ�����һλ����
		int temp = arr[0];
		arr[0] = arr[bit-1];
		arr[bit-1] = temp;
		
		//�����ƴ�ӳ��ַ���
		String result = "";
		for(int i=0;i<arr.length;i++){
			result += arr[i];
		}
		return result;
	}
}
