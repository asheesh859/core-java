package Loosely_Caupled;

public class Log4J implements SL4J {

	@Override
	public void info() {
		System.out.println("info from log4j");
		
	}

	@Override
	public void error() {
		System.out.println("error from log4j");
		
	}

	@Override
	public void warn() {
		System.out.println("warning from log4j");
		
	}


}
