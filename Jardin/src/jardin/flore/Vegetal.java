package jardin.flore;

public abstract class Vegetal {
	
	private char dessin[];
	private Etat etat;
	
	public Vegetal() {
		this.dessin = new char[6];
		this.etat = Etat.GRAINE;
	}
	
}
