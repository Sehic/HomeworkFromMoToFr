
public class Animals {
	private String vrsta;
	private String zvuk;

	public String getZvuk() {
		return zvuk;
	}

	public void setZvuk(String zvuk) {
		this.zvuk = zvuk;
	}
	
	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

	public String toString() {
		return "Vrsta: " +vrsta+" \n"+"Zvuk: "+zvuk+"\n-----------------------";
	}
	
	
}


