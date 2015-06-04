import java.util.Arrays;
import java.util.Scanner;


public class Task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] arr = new int [100000];
		for(int i =0; i< arr.length;i++){
			arr[i]=(int)(Math.random()*99999);
		}
		Arrays.sort(arr);
		System.out.println("Enter the number you want to look for");
		int N = input.nextInt();
		long a = System.currentTimeMillis();
		System.out.println("Number "+N+" is at index (binarySearch) "+Arrays.binarySearch(arr, N));
		long b = System.currentTimeMillis();
		long rez = b-a;
		System.out.println("Time in miliseconds (binarySearch): "+rez);
		long c = System.currentTimeMillis();
		int index=0;
		boolean temp = false;
		for(int i = 0; i<arr.length;i++){
			if(arr[i]==N){
				temp = true;
				index=i;
			}
		}
		if(temp==true)
		System.out.println("Number "+N+" is at index (FromTask6Code) "+index);
		else
			System.out.println("There is no number that you asked");
		long d = System.currentTimeMillis();
		long rez2 = d-c;
		System.out.println("Time in miliseconds (FromTask6Code): "+rez2);

	}

}
