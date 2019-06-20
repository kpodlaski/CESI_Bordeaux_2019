package simple.javaElements;

public class HelloWorld {
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		HelloWorld hw = new HelloWorld();
		hw.writeText("Hello ");
		hw.writeObject(hw);
		
		System.out.println(hw.lengthOfText("Mamma Mia"));
		
		ExceptionExample ee = new ExceptionExample();
		try{
			//If we uncomment line below it won't fire pointcut IOException because of exception type
			//ee.exceptionCase2();
			ee.exceptionCase(3);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void writeText(String text)
	{
		System.out.println(text);
	}
	
	public void writeObject(Object o)
	{
		System.out.println(o);
	}
	
	public int lengthOfText(String s)
	{
		return s.length();
	}

}
