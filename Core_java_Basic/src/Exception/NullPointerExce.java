package Exception;

public class NullPointerExce {
	int x = 10;
	public static void main(String[] args) {
		try {
			
			System.out.println("Null pointer");
			NullPointerException a1 = null;
			System.out.println(a1.x);
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("welcome");
	}

}
