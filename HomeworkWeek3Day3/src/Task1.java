
public class Task1 {

	public static void main(String[] args) {
		int [] arr = new int [100];
		int counter = 0;
		for(int i=0;i<100;i++){
			arr[i]=counter;
			counter++;
			if(counter>9)
				counter=0;
		}
			
		for(int i=0;i<100;i++){
			System.out.printf(" %d",arr[i]);
			if(arr[i]==9)
				System.out.println();
		}

	}

}
