package N1Ex1;

public class Producte {

	//Attributes
	protected String nom;
	protected float preu;
	
	//Constructor
	public Producte (String nom, float preu) {
		this.nom = nom.toUpperCase();
		this.preu = preu;
	}
	
	//Get methods
	public String getNom() {
		return nom;
	}
	public float getPreu() {
		return preu;
	}
	
	//Set methods
	public void setNom (String nom) {
		this.nom = nom.toUpperCase();
	}
	public void setPreu (float preu) {
		this.preu = preu;
	}
	
}
