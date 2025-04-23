package Exception;

public class ArrayOutOfBoundExce {

	public static void main(String[] args) {
		//array read time exception
		try {
			int[] arr = new int[3];
			arr[0]=10;
			arr[1]=20;
			arr[2]=30;
			arr[3]=40;
			System.out.println("welcome");
			
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
	}

}
