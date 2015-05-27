package ba.bitcamp.hajrudin.objects.subroutines;

public class Task7 {

	public static void main(String[] args) {
		for(int x=1; x<10000000; x++){
		for(int i = 1; i<=x;i++){
			int nekiNoviBroj = 2;
			for(int j=1; j<i;j++){
				nekiNoviBroj*=2;
			}
			nekiNoviBroj*=i;
			nekiNoviBroj--;
			if(nekiNoviBroj==x){
				System.out.println(x);
				break;
			}
		}

	}}

}
