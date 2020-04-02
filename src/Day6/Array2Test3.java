package Day6;

import java.util.Scanner;

public class Array2Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请入数加密前的数(整数)：");
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
		//将输入的数字转成倒序数组
		for(int x=0;x<bit;x++){
			arr[x]=(int) ((a/(Math.pow(10, x)))%10);
		}
		
		//第二种转换数组方法
		int index = 0;
		while(a>0){
			arr[index] = a%10;
			index++;
			a/=10;
		}
		//将第二种方法改进
		for(int i=0;i<bit;i++){
			arr[i]=a%10;
			a/=10;
		}
		
		//将每位数字加5，再用和除以10的余数代替该数字
		for(int x=0;x<arr.length;x++){
			arr[x] = (arr[x]+5)%10;
		}
		
		//逆序数组
		
		for(int start=0,end=arr.length-1;start<=end;start++,end--){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] =temp;
		}
		//将第一位和最后一位互换
		int temp = arr[0];
		arr[0] = arr[bit-1];
		arr[bit-1] = temp;
		
		//将结果拼接成字符串
		String result = "";
		for(int i=0;i<arr.length;i++){
			result += arr[i];
		}
		System.out.println(result);
		
		//遍历数组测试
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
		//将输入的数字转成倒序数组
		/*for(int x=0;x<bit;x++){
			arr[x]=(int) ((a/(Math.pow(10, x)))%10);
		}*/
		
		//第二种转换数组方法
	/*	int index = 0;
		while(a>0){
			arr[index] = a%10;
			index++;
			a/=10;
		}*/
		//将第二种方法改进
		for(int i=0;i<bit;i++){
			arr[i]=number%10;
			number/=10;
		}
		
		//将每位数字加5，再用和除以10的余数代替该数字
		for(int x=0;x<arr.length;x++){
			arr[x] = (arr[x]+5)%10;
		}
	/*	
		//逆序数组
		
		for(int start=0,end=arr.length-1;start<=end;start++,end--){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] =temp;
		}*/
		//将第一位和最后一位互换
		int temp = arr[0];
		arr[0] = arr[bit-1];
		arr[bit-1] = temp;
		
		//将结果拼接成字符串
		String result = "";
		for(int i=0;i<arr.length;i++){
			result += arr[i];
		}
		return result;
	}
}
