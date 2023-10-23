package Pck1;

public class MainClass {

	public static void main(String[] args) {
		
		Data pOne = new Data();
		
		pOne.storeRndNbrs();
		
		ProcessData pd = new ProcessData(pOne);
		pd.calcSum();
		pd.calcMean();
		
		
		pOne.displayData();
		pd.displayData();
		
		
		

	}

}
