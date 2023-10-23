package N3Ex1;

import java.util.ArrayList;

public class GestioButaques {
	
	private ArrayList <Butaca> llistaButaques;
	
	public GestioButaques() {
		llistaButaques = new ArrayList<Butaca>();
	}
	
	public ArrayList<Butaca> getLlistaButaques(){
		return llistaButaques;
	}
	
	
	public void afegirButaca(Butaca butaca) throws ExcepcioButacaOcupada{
		if (cercarButaca(butaca.getFila(), butaca.getSeient()) == -1) {
			llistaButaques.add(butaca);
		} else {
			throw new ExcepcioButacaOcupada();
		}
	}
	
	
	public void eliminarButaca(int fila, int seient) throws ExcepcioButacaLliure{
		int idButaca = cercarButaca(fila, seient);
		
		if(idButaca != -1) {
			llistaButaques.remove(idButaca);
		} else {
			throw new ExcepcioButacaLliure();
		}
		
	}
	
	
	public int cercarButaca(int fila, int seient) {
		boolean butacaTrobada = false;
		int contButaca = -1;
		int id = 0;
		
		do {
			for (int cont = 0; cont < llistaButaques.size(); cont++) {
				
				if (fila == llistaButaques.get(cont).getFila() && seient == llistaButaques.get(cont).getSeient()) {
					contButaca = cont;
					butacaTrobada = true;
				} else {
					id++;
					butacaTrobada = false;
				}
			}
			
		}while(butacaTrobada = false || id < llistaButaques.size());
		
		return contButaca;
		
	}

}
