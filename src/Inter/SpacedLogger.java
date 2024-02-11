package Inter;

public class SpacedLogger implements Logger {
	@Override
    public void log(String Hello) {
        for (int i = 0; i < Hello.length(); i++) {
            System.out.print(Hello.charAt(i) + " "); 
        }
        System.out.println(); 
    }

    @Override
    public void error(String Hello) {
        System.out.print("ERROR: ");
        for (int i = 0; i < Hello.length(); i++) {
            System.out.print(Hello.charAt(i) + " ");
        }
        System.out.println();
    }

    @Override
    public void close() {
        

	

	}

}
