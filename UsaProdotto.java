package SuperClassi.prodotto;

import java.util.ArrayList;

public class UsaProdotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Prodotto> list = new ArrayList<>();
		
		Prodotto p1 = new Prodotto("banane", 2.50, 10);
		Prodotto p2 = new Prodotto("pere", 1.50, 5);
		Prodotto p3 = new Prodotto("ananas", 3.00);
		Prodotto p4 = new ProdottoScontabile("mele", 5.00, 10);
		
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		for(Prodotto cont: list) {
			System.out.println(cont);
		}
		
		p1.vendi();
		p2.vendi();
		p3.vendi();
		p4.vendi();
		
		for(Prodotto cont: list) {
			System.out.println(cont);
		}
		
		

	}

}
