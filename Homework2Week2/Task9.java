
public class Task9 {

	public static void main(String[] args) {
		int stranica = 7;
		for(int i=1;i<=stranica;i++){
			for(int j=1;j<=stranica;j++){
				if((i+j)>stranica){
					System.out.print("*");
					System.out.print(" ");
				}

				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
