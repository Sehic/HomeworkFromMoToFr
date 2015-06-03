import java.util.Arrays;
import java.util.Scanner;


public class Task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int lenght = input.nextInt();
		String [] arr = new String [lenght];
		input.nextLine();
		for(int i = 0; i<arr.length;i++){
		System.out.println("Input string in index "+ i+ " and press enter");
		arr[i]=input.nextLine();
		}
		int [] arr2 = {0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length();j++){
				switch(arr[i].charAt(j)){
				case '0':
					arr2[0]+=1;
					break;
				case '1':
					arr2[1]+=1;
					break;
				case '2':
					arr2[2]+=1;
					break;
				case '3':
					arr2[3]+=1;
					break;
				case '4':
					arr2[4]+=1;
					break;
				case '5':
					arr2[5]+=1;
					break;
				case '6':
					arr2[6]+=1;
					break;
				case '7':
					arr2[7]+=1;
					break;
				case '8':
					arr2[8]+=1;
					break;
				case '9':
					arr2[9]+=1;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr2));
	}

}
