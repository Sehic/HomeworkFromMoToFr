package ba.bitcamp.hajrudin.objects.subroutines;

public class Task5 {

	public static void main(String[] args) {
		int pomocni = 0, noviBroj = 0;
		for(int i=10301;i<100000;i++){
			int broj=i;
		while(broj>0){
			pomocni=broj%10;
			broj/=10;
			noviBroj+=pomocni;
			noviBroj*=10;
		}
		noviBroj/=10;
		if(noviBroj==i){
			int brojac4=2;
			boolean nest = true;
			while(brojac4<=i){
				if(i%brojac4 == 0 && brojac4 != i){
					nest = false;
					break;
			}
				brojac4++;
			}
			if(nest==true)
			System.out.println(i);
			}
		noviBroj=0;
		}

	}

}
