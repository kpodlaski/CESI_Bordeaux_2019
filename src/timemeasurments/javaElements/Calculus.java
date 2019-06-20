package timemeasurments.javaElements;

import timemeasurments.javaElements.executionTime.InfiniteCalculations;
import timemeasurments.javaElements.executionTime.MathematicalAlgorithms;
import timemeasurments.javaElements.executionTime.SquareCounts;

public class Calculus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathematicalAlgorithms ma = new SquareCounts();
		
		System.out.println(ma.count(360000045, 0.000002));
		
		ma = new InfiniteCalculations();
		System.out.println(ma.count(-3, 0.000002));
	}
	
	public double someMethod(){
		return 0.0;
	}
}
