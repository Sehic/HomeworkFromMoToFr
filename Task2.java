
public class Task2 {

	public static void main(String[] args) {
		int num = 6, counter = 1, sum = 0;
		while(counter<=num){
			if(counter%2==0)
				sum+=counter;
			counter++;
		}
		System.out.println("Suma parnih brojeva je: "+sum);
		
	}

}
