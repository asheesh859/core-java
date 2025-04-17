package final_Keyword;

public class E {
	

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int result = a / b;
			System.out.println(result);
			
		} 
		catch (Exception e) {
			System.out.println("error exception occur : "+e.getMessage());
			e.printStackTrace();
		}
		
		finally {
			System.out.println("always executes");
		}
	}

}
