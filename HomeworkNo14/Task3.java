import java.util.Scanner;


public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [][] matr = {{1,2,1},{5,2,8},{-4,2,3}};
		System.out.println("Unesite vrijednost x");
		int x = input.nextInt();
		System.out.println("Unesite vrijednost y");
		int y = input.nextInt();
		System.out.println("Maximalan broj poena je "+getMaxPoints(matr, x, y));

	}
	
	public static int getMaxPoints(int matr [][],int x, int y){
		int maxPoint = 0;
		if(x==1 && y == 1){
			maxPoint = matr[x][y];
			return maxPoint;
		} else if(x==0 && y==0){
			if(matr[x+1][y+2]>matr[x+2][y+1]){
				maxPoint=matr[x+1][y+2];
			} else{
				maxPoint=matr[x+2][y+1];
			}
			return maxPoint;
		}else if(x==0 && y==1){
			if(matr[x+2][y-1]>matr[x+2][y+1]){
				maxPoint=matr[x+2][y-1];
			} else{
				maxPoint=matr[x+2][y+1];
			}
			return maxPoint;
		}else if(x==0 && y==2){
			if(matr[x+2][y-1]>matr[x+1][y-2]){
				maxPoint=matr[x+2][y-1];
			} else{
				maxPoint=matr[x+1][y-2];
			}
			return maxPoint;
		}else if(x==1 && y==0){
			if(matr[x-1][y+2]>matr[x+1][y+2]){
				maxPoint=matr[x-1][y+2];
			} else{
				maxPoint=matr[x+1][y+2];
			}
			return maxPoint;
		}else if(x==1 && y==2){
			if(matr[x-1][y-2]>matr[x+1][y-2]){
				maxPoint=matr[x-1][y-2];
			} else{
				maxPoint=matr[x+1][y-2];
			}
			return maxPoint;
		}
		else if(x==2 && y==0){
			if(matr[x-2][y+1]>matr[x-1][y+2]){
				maxPoint=matr[x-2][y+1];
			} else{
				maxPoint=matr[x-1][y+2];
			}
			return maxPoint;
		}else if(x==2 && y==1){
			if(matr[x-2][y-1]>matr[x-2][y+1]){
				maxPoint=matr[x-2][y-1];
			} else{
				maxPoint=matr[x-2][y+1];
			}
			return maxPoint;
		}else if(x==2 && y==2){
			if(matr[x-1][y-2]>matr[x-2][y-1]){
				maxPoint=matr[x-1][y-2];
			} else{
				maxPoint=matr[x-2][y-1];
			}
			return maxPoint;
		}
		return maxPoint;
	}

}
