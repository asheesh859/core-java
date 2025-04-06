package RunTimePolimorphism;

public class PlatinumAccount extends GoldAccount {

	@Override
	public void dailyCashLimits() { // error because method not same 
		System.out.println("50000");
	}
	
	public static void main(String[] args) {
		PlatinumAccount p = new PlatinumAccount();
		p.dailyCashLimit();
		p.dailyCashLimits();
	}

}
