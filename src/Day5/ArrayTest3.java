package Day5;
//����Ԫ������
public class ArrayTest3 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		
		print(arr);
		System.out.println("-----------------------");
		reverse(arr);
		print(arr);
		
	}
	//����
	public static void print(int[] arr){
		System.out.print("[");
		for(int i=0; i<arr.length; i++){
			if(i == arr.length-1){
				System.out.println(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
	//����
	public static void reverse(int[] arr){
		for(int i=0; i<arr.length/2; i++){
			int	flag = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = flag;	
		}
	}
}
