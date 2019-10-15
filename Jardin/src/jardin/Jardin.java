package jardin;

import java.util.HashMap;

public class Jardin {

	private int longueur;
	private int largeur;
	private HashMap<String,Integer> panier;
	private Emplacement emplacement[][];
	
	public Jardin(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
		emplacement = new Emplacement[this.longueur][this.largeur];
		this.panier = new HashMap<String,Integer>();
		this.panier.put("Ail", 4);
		this.panier.put("Beterave",7);
		this.panier.put("Carotte",2);
	}
	
//	public Jardin(String nomDuVegetal, String quantite) {
		
//		this.nomDuVegetal = nomDuVegetal
//		this.quantite = quantite
//		this.panier = new HashMap<String,Integer>();
//		this.panier.put("Tomate",5);
//		this.panier.put("Carotte",5);
//		this.panier.put("Ail",10);
//		this.panier.put("Betrave",5);
		
	}
