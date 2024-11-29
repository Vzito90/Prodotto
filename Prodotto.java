package SuperClassi.prodotto;

public class Prodotto {
	
	String descrizione;
	double prezzo;
	int quantita;
	
	public Prodotto(String descrizione, double prezzo, int quantita) {
		super();
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.quantita = quantita;
	}
	public Prodotto(String descrizione, double prezzo) {
		super();
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.quantita=0;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	@Override
	public String toString() {
		return "Prodotto [descrizione=" + descrizione + ", prezzo=" + prezzo + ", quantita=" + quantita + "]";
	}
	
	public void rifornisci(int quantita) {
		this.quantita+=quantita;
	}
	
	public boolean vendi() {
		boolean check=false;
		if(this.quantita>0) {
			check=true;
			System.out.println(this.descrizione + " " + "prezzo: "+ this.prezzo);
			this.quantita--;
		} else {
			System.out.println("FALSE");
		}
		
		return check;
	}
	
	

}
