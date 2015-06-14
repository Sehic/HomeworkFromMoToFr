package ba.bitcamp.hajrudin.homework13;

public class Task2 {

	public static void main(String[] args) {
		try{
		int min = Integer.parseInt(args[0]);
		for(int i = 0; i<args.length;i++){
			if(min>Integer.parseInt(args[i])){
				min = Integer.parseInt(args[i]);
			}
		}
		System.out.println("Min number is: "+min);

	}catch(Exception ex){
		ex.getMessage();
		System.out.println("Vrong input!");
	}
	}

}
