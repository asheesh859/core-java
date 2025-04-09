package Loosely_Caupled;

public class BackLog implements SL4J{


	@Override
	public void info() {
		System.out.println("info from Backlog");
		
	}

	@Override
	public void error() {
		System.out.println("error from Backlog");
		
	}

	@Override
	public void warn() {
		System.out.println("warning from Backlog");
		
	}

}
