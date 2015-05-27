import java.util.Scanner;


public class Task10 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Unesite dva broja");
	     int a = in.nextInt();
	     int b = in.nextInt();
	     int NZD = 0;
	     int broj = 0;
	     if(a<b)
	    	 broj=a;
	     else
	    	 broj=b;
	     for(int i=1;i<=broj;i++){
	    	 if(a%i==0 && b%i==0)
	    		 NZD=i;
	     }
	     System.out.println("Najveci zajednicki djelilac je "+NZD);
	}

}
