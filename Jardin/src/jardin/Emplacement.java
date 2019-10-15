package jardin;

import jardin.flore.Vegetal;

public class Emplacement {

	private Vegetal vegetal;

	public Vegetal getVegetal() {
		return vegetal;
	}

	public void setVegetal(Vegetal vegetal) {
		this.vegetal = vegetal;
	}
	
	public Emplacement(Vegetal v) {
		this.vegetal = v;
	}
	
}
