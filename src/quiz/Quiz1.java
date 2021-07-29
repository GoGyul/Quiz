package quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
	
	
	int totalLine = 4;
	int spaceLine = totalLine/2 +1;
	int starLine = 1;
	
	for(int i =0; i<totalLine; i++) {
		
		for(int x =0; x < spaceLine; x++) {
			System.out.print(" ");
		}
		
		for(int j = 0; j < starLine; j++) {
			System.out.print("*");
		}
		for(int x = 0; x < spaceLine; x++ ) {
			System.out.print(" ");
		}
		System.out.println();
		spaceLine -= 1;
		starLine += 2;

	   }
	}
}
