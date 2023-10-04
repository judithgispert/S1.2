package N1Ex1;
import java.util.ArrayList;

public class Venda {

	//Attributes
	protected ArrayList<Producte> llistaProductes;
	protected float preuTotal;
	private Producte producte;
	
	//Constructors
	public Venda () {
		llistaProductes = new ArrayList<Producte>();
	}
	
	//Get methods
	public ArrayList<Producte> getLlistaProductes() {
		return llistaProductes;
	}
	public float getPreuTotal() {
		return preuTotal;
	}
	
	//Method CALCULARTOTAL() - Exception VENDABUIDAEXCEPTION
	public float calcularTotal() throws VendaBuidaException{
		int cont = 0;
		if (llistaProductes.isEmpty()) {
			throw new VendaBuidaException("Per fer una venda primer has d’afegir productes.");
		}else {
			do {
				float preu = llistaProductes.get(cont).getPreu();
				preuTotal+=preu;
				cont++;
			}while(cont < llistaProductes.size());
		}
		return preuTotal;
	}

}
