package Pck1;

public class MainClass { //extends Data { //no need to make references, "glued together"

	public static void main(String[] args) {
		
		//MainClass mc = new MainClass(); creates a second main class to obstantiate
		Stats st = new Stats();
		//Data pD = new Data();
		
		//st.d = pD; //means statistcs class is one layer higher than Data, has all knowledge of Data class
		
		st.displayData();

	}

}
