package Array_in_Java;

public class Example_3 {
	//find even  number in array
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0]=10;
		arr[1]=15;
		arr[2]=20;
		arr[3]=25;
		arr[4]=30;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(+arr[i]+" ");
			}
		}
	
	}

}
