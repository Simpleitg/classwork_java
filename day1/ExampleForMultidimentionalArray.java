package day1;

public class ExampleForMultidimentionalArray {

	public static void main(String[] args) {

		        int[][] arr = new int[][] {
		            {1, 2, 3},
		            {4, 5, 6}
		        };

		        for (int i = 0; i < arr.length; i++) {          // rows
		            for (int j = 0; j < arr[i].length; j++) {   // columns
		                System.out.print(arr[i][j] + " ");
		            }
		            System.out.println();
		        }


	}

}
