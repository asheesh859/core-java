package Exception;

public class NumberFormetExce {

	public static void main(String[] args) {
		
		//Convert String to Number
		String num = "10";
		int number = Integer.parseInt(num);
		
		System.out.println("integer : "+number);
		
		
		//Convert String to Double
		
		String doub = "10.3";
		
		double x = Double.parseDouble(doub);
		System.out.println("Double : "+x);
		
		//convert string to float 
		
		String f = "10.5";
		
		float n = Float.parseFloat(f);
		System.out.println("float : "+n);
	}

}
