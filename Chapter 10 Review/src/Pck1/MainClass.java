package Pck1;

public class MainClass {

	public static void main(String[] args) {

		Data list = new Data(15, 101);
		list.createArray();
		
		Data p = list;
		
		p.pNext = new Data(15,101);
		p = p.pNext;
		p.createArray();
		
		p.pNext = new Data(15,101);
		p = p.pNext;
		p.createArray();
		
		p.pNext = new Data(15,101);
		p = p.pNext;
		p.createArray();
		
		p = list; 
		
		while (true) {
			
			System.out.println(p);
			p.displayData();
			
		if (p.pNext == null) {
			break;
		}
		
		else {
			p = p.pNext;
		}
		}

	}
}

