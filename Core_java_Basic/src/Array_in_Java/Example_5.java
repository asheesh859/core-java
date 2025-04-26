package Array_in_Java;

public class Example_5 {

		public static void main(String[] args) {
			int arr[]= {10,30,30,66,66,70,80,80};
			int temp[]= {};
			int j=0;
			
			for(int i=0; i<arr.length; i++) {
				for(i=i+1; i<arr.length; i++ ) {
					if(arr[i]!=arr[i+1]) {
						temp[j++]=arr[i];
						
						
					}
				}
				
			}
			for(int i=0; i<temp.length; i++) {
				System.out.println(temp[i]);
			}
		}

}
