package simple.aspectElements;
//import simple.javaElements.*;

public aspect FirstAspect {

pointcut writing() : execution (* HelloWorld.writeObject(..));
	
	
	pointcut calling() : call ( HelloWorld.new());
	
	before() : writing() 
	{
		System.out.println("Additional Text");
	}
	
	before() : calling()
	{
		System.out.println("Constructor called");
	}
	
	
	after() : writing()
	{
		System.out.println("Thanks for listening");
	}
	
	pointcut writing2() : execution(* HelloWorld.writeText(..));
	
	void around() : writing2()
	{
		System.out.println("Start Around");
		proceed();
		System.out.println("End Around");
	}
	
	pointcut  length() : execution(* HelloWorld.lengthOfText(..));
	
	int around() : length()
	{
		int value = proceed();
		return value * 40;
	}
	
}
