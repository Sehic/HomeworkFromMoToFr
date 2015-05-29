package ba.bitcamp.hajrudin.models;

public class Planeta {

	private Integer tezina;
	private Integer masa;
	private String oblik;
	private String ime;
	public Planeta(Integer tezina, Integer masa, String oblik, String ime) {
		super();
		this.tezina = tezina;
		this.masa = masa;
		this.oblik = oblik;
		this.ime = ime;
	};
	
	public void dodajMasu(Integer dodatak){
		this.masa+=dodatak;
	}
	public Integer vrijednostMase(){
		return this.masa;
	}
	
	
	
}
