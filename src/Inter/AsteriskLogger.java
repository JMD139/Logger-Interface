package Inter;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String Hello) {
		System.out.println("***" + "Hello" + "***");

	}

	@Override
	public void error(String Hello) {
		System.out.println("**********************");
		System.out.println("***Error: " + "Hello" + "***");
		System.out.println("***********************");
	}

	@Override
	public void close() {

	}

}
