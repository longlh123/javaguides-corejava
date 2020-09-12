package arraybasic;

public class TwoDimensionArray {
	public static void main(String[] args) {
		
		//an array of int arrays of 2 rows and 3 columns
		int[][] twoDimensionArray = new int[2][3];
		
		for(int i = 0; i < twoDimensionArray.length; i++) {
			for(int j = 0; j < twoDimensionArray[i].length; j++) {
				twoDimensionArray[i][j] = j;
				System.out.println(twoDimensionArray[i][j] + " ");
			}
			System.out.println();
		}
		
		//an array of String array of 3 rows and 4 columns
		String[][] arrStr = new String[3][4];
		
		for(int i = 0; i < arrStr.length; i++) {
			for(int j = 0; j < arrStr.length; j++) {
				arrStr[i][j] = "Str_" + i + "_" + j;
				System.out.println(arrStr[i][j] + " ");
			}
			System.out.println();
		}
		
		//Creating and initializing two dimension array with shortcut
		int[][] arrInt = { { 1, 2, 3}, { 4, 5, 6} };
		
		for(int i = 0; i < arrInt.length; i++) {
			for(int j = 0; j < arrInt[i].length; j++) {
				System.out.println(arrInt[i][j] + " ");
			}
			System.out.println();
		}
	}
}
