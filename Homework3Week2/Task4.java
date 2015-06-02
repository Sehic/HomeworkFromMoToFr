package ba.bitcamp.hajrudin.objects.subroutines;

public class Task4 {

	public static void main(String[] args) {
		int pomocni = 0, noviBroj = 0;
		for(int i=1001;i<10000;i++){
			int broj=i;
		while(broj>0){
			pomocni=broj%10;
			broj/=10;
			noviBroj+=pomocni;
			noviBroj*=10;
		}
		noviBroj/=10;
		if(noviBroj==i)
			System.out.println(i);
		noviBroj=0;
		}

}
}