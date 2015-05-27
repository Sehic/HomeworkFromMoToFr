package ba.bitcamp.hajrudin.objects.subroutines;

public class Task6 {

	public static void main(String[] args) {
		for(int j = 131071;j<1000000;j++){
		int noviBroj=j+1;
		int counter = 0;
		int pomocni = 1;
		while(noviBroj>1){
			noviBroj/=2;
			counter++;
		}
		for(int i = 0; i<counter;i++){
			pomocni*=2;
		}
		pomocni-=1;
		if(pomocni==j)
			System.out.println(j);
	}}

}
