package ba.bitcamp.hajrudin.objects.subroutines;

public class Task3 {

	public static void main(String[] args) {
		int brojac4=2;
		boolean nest = true;
		for(int i=101;i<1000;i++){
			while(brojac4<=i){
				if(i%brojac4 == 0 && brojac4 != i){
					nest = false;
					break;
			}
				brojac4++;
			}
			if(nest==true)
			System.out.println(i);
			nest=true;
			brojac4=2;
		}

	}

}
