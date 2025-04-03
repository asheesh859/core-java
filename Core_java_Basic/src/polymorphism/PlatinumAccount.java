package polymorphism;

public class PlatinumAccount extends GolaAccount {

	public void DailyCashLimits() {
		System.out.println("50,000");
	}

	public void rateOfIntrest() {
		System.out.println("6% rate of intrest");
	}

	public static void main(String[] args) {

		GolaAccount g = new GolaAccount();

		g.DailyCashLimits();
		g.OnllineBanking();
		g.rateOfIntrest();

		PlatinumAccount p = new PlatinumAccount();

		p.DailyCashLimits();
		p.OnllineBanking();
		p.rateOfIntrest();
	}

}
