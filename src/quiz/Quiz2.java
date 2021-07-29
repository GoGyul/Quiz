package quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		int totalLine = 7;
		int starLine = 1;
		int spaceLine = totalLine/2 +1;
		
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
			if (i < totalLine/2) {
				spaceLine -= 1;
				starLine += 2;
			}else {
				spaceLine += 1;
				starLine -= 2;
			}
			System.out.println();

		   }

	}

}
