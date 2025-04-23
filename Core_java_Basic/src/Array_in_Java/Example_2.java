package Array_in_Java;

public class Example_2 {

	public static void main(String[] args) {
		int arr[]= new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
