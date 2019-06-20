package timemeasurments.aspectElements;
import timemeasurments.javaElements.*;
import timemeasurments.javaElements.executionTime.*;


public aspect TimeConsumption {
	
	pointcut counting(double number, double prec) : execution(* MathematicalAlgorithms.count(..)) && args(number,prec);
	
	
	double around(double number, double prec) : counting(number,prec)
	{
		Thread timeCount = new TimeCounting();
		timeCount.start();
		long start = System.currentTimeMillis();
		double result = proceed(number,prec);
		long end = System.currentTimeMillis();
		long time = end - start;
		timeCount.stop();
		System.out.println("Couting takes " + time + " ms " 
							+ thisJoinPoint.getSignature() 
							+ "Args: "+number + ", "+prec);
		
		return result;
	}
	
	public class TimeCounting extends Thread
	{

		@Override
		public void run() {
			long start = System.currentTimeMillis();
			while (true)
			{
				long end = System.currentTimeMillis();
				long time = end - start;
				if (time > 1) Runtime.getRuntime().exit(1);
			}
		}
		
	}

}
