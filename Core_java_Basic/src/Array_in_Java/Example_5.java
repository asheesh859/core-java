package Array_in_Java;

public class Example_5 {

		public static void main(String[] args) {
			int arr[]= {10,30,30,66,66,70,80,80};
			int temp[]= new int[arr.length];
			int j=0;
			
			for(int i=0; i<arr.length-1; i++) 
				{
					if(arr[i]!=arr[i+1]) {
						temp[j]=arr[i];
						j++;
						j++;
						
					}
				
				
			}
				temp[j]=arr[arr.length-1];
				
			for(int t:temp) {
				if(t==0) {
					break;
				}
				System.out.println(t);
			}
		}

		}
