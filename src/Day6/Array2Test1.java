package Day6;

public class Array2Test1 {
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{3,4},{4,5},{5}};
		int sum = getArray(arr);
		System.out.println("二维数组的和是："+sum);
		
	}
	public static int getArray(int[][] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				sum += arr[x][y];
			}
		}
		return sum;
	}
}
