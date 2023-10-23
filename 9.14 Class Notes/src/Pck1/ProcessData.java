package Pck1;

public class ProcessData {

	double mean;
	double sum;
	Data temp;
	
	public ProcessData(Data pTemp) {
		
		temp = pTemp;
		
	}
	
	public void calcSum() {
		
		sum = 0;
		for (int i = 0; i < temp.ary.length; i++) {
		sum += (double) temp.ary[i];
	} 
	
		
			
		double mean = sum / temp.ary.length;
		}
	
	public void dsplayData() {
		System.out.println("Sum = " + sum + " and Mean = " + mean);
		System.out.printf("Sum = %1.4f and mean = %1.4f \n", sum, mean);
	}

	public void calcMean() {
		
	}

	public void displayData() {
		
		
	}
}