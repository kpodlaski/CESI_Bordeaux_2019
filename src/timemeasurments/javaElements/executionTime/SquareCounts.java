package timemeasurments.javaElements.executionTime;

public class SquareCounts implements MathematicalAlgorithms{

	public double count(double d, double precision) {

		double start = 0.0;
		double end = d;
		double value = d/2;
		double res;
		
		do 
		{
			res = d - value*value;
			if (res<0) end = value;
			else 	   start = value;
			value = (end + start)/2;
			
			int x=1;
			for (int y=0; y<10000; y++) {x +=x*y;}
		}
		while( Math.abs(res)/d  > precision );
		return value;
	}
	
	

}
