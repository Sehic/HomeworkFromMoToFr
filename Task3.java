
public class Task3 {

	public static void main(String[] args) {
		int num = 28, counter = 1, sum = 0;
		while(counter<num){
			if(num%counter==0)
				sum+=counter;
			counter++;
		}
		if(num == sum)
			System.out.println("Broj je dobar");
		else
			System.out.println("Broj nije dobar");
	}

}
