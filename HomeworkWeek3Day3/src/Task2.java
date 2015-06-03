import java.util.Arrays;
import java.util.Scanner;


public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr1=new int [5];
		int [] arr2=new int [5];
		for(int i = 0; i<5;i++){
			System.out.println("Input number for first array index "+i);
			arr1[i]=input.nextInt();
			System.out.println("Input number for second array index "+i);
			arr2[i]=input.nextInt();
		}
		int counter=-1;
		for(int i =0; i<5; i++){
			if(arr1[i]==arr2[i])
				counter++;
			if(counter!=i)
				break;
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		if(counter==4)
			System.out.println("Arrays are identical");
		else
			System.out.println("Arrays are not identical");
		
	}

}
