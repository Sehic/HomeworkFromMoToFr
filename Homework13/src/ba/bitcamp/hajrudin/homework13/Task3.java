package ba.bitcamp.hajrudin.homework13;

public class Task3 {

	public static void main(String[] args) {
		if(args.length>1){
			System.out.println("Please pass only one String to the program.");
		} else if(args.length==0){
			System.out.println("Please pass one String to the program.");
		} else {
			int a = getCountOfNumbers(args[0]);
			if(a==0){
				System.out.println(args[0]+" does not contain any numbers.");
			} else{
			System.out.println(args[0]+" contains "+a+" numbers.");
			}
		}
		

	}
	/**
	 * This method count numbers in String
	 * @param s String
	 * @return returns count of numb in string
	 */
	public static int getCountOfNumbers(String s){
		int count = 0;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i)>47 && s.charAt(i)<58){
				count++;
			}
		}
		return count;
	}

}
