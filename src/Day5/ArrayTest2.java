package Day5;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		//��ȡ��ֵ
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("���ֵΪ��"+max);
	}
}
