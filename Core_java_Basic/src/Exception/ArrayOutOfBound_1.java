package Exception;

public class ArrayOutOfBound_1 {

	public static void main(String[] args) {

		try {
			int[] arr = new int[2];

			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

}
