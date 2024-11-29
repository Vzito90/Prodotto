package SuperClassi.prodotto;

import java.util.Scanner;

public class ProdottoScontabile extends Prodotto{
	
	boolean prodScont;
	int contQ=3;
	
	public ProdottoScontabile(String descrizione, double prezzo, int quantita) {
		super(descrizione, prezzo, quantita);
		this.prodScont=true;
		
	}


	@Override
	public String toString() {
		return "ProdottoScontabile [prodScont=" + prodScont + ", descrizione=" + descrizione + ", prezzo=" + prezzo
				+ ", quantita=" + quantita + "]";
	}
	
	@Override
	public boolean vendi() {
		int quantV;
		Scanner scan = new Scanner(System.in);
		System.out.println("quanti pezzi vuoi comprare? ");
		quantV=scan.nextInt();
		scan.nextLine();
		boolean check=false;
		if(prodScont) {
			if(this.quantita>0) {
				if(quantV>=contQ) {
					check=true;
					System.out.println(this.descrizione + " " + "prezzo: "+ this.prezzo);
					this.prezzo=this.prezzo*quantV*0.8;
					
					this.quantita-=quantV;
				} else {
					System.out.println("FALSE");
				}					
			}
		}
		
		scan.close();
		return check;			

	}
	

}
