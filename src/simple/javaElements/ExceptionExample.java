package simple.javaElements;

import java.io.IOException;

public class ExceptionExample {

	public void exceptionCase(int arg) throws IOException
	{
		if (arg>4) return;
		else throw new IOException("Application reading problem");
		 	
	}
	
	public void exceptionCase2() throws SecurityException
	{
		throw new SecurityException("Some security problem");
	}
	
}
