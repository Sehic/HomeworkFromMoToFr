package ba.bitcamp.hajrudin.objects.subroutines;

public class Main {

	
	public static void sayHello(String name){
		System.out.println("Hello "+ name);
	}
	
	public static boolean isPositive (int num){
		return (num >= 0) ? true : false ;
	}
	
	public static boolean isPrime (int num){
		for(int i = 2; i < num; i++){
			if(num % i == 0)
				return false;
		}
		return true;
	}
	
	public static int getSum (int a, int b, int c){
		int suma = 0;
		for(int i = 0; i<=a; i++){
			suma+=i;
		}
		for(int i = 0; i<=b; i++){
			suma+=i;
		}
		for(int i = 0; i<=c; i++){
			suma+=i;
		}
		return suma;
	}
	
	public static int getNumberOfHoles(String num){
		int sum = 0;
		char num1;
		int num2 = num.length();
		for(int i = 0; i<num2; i++){
			num1 = num.charAt(i);
			if(num1 == '4' || num1 == '6' || num1 == '9' || num1 == '0')
				sum+=1;
			else if (num1=='8')
				sum+=2;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		//   System.out.println(getSum(7,6,3));
		//System.out.println(getNumberOfHoles("888"));
		int num = 210;
			for(int i = 2; i<=num;i++){
				do{
			if(num%i==0){
				num/=i;
				System.out.print(i+ " ");
				}
			}while(num%i==0);
			
		
	}

}
}