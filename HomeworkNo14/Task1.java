
public class Task1 {
	

			public static void main(String[] args) {
				    int[][] matr = {{51,2,15} , {41,15,98}, {41,48,15}};
				    int num = 15;
				    System.out.println(countNum(matr, num));
				}
			
			 public static int countNum (int matr[][], int num){ 
				 int counter = 0; for (int i = 0; i < matr.length; i++){ 
					 for (int j = 0; j < matr[i].length; j++){ 
						 if (matr[i][j] == num){
							 counter++; 
						 } 
						 } 
					 } 
				 return counter; 

	}

}
