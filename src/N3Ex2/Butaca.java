package N3Ex2;

public class Butaca {

	
	private int fila;
	private int seient;
	private String persona;
	
	
	public Butaca (int fila, int seient, String persona) {
		this.fila = fila;
		this.seient = seient;
		this.persona = persona;
	}
	
	
	public int getFila() {
		return fila;
	}
	public int getSeient() {
		return seient;
	}
	public String getPersona() {
		return persona;
	}
	

	public boolean equals(Butaca butaca) {
		return fila == butaca.getFila() && seient == butaca.getSeient();
	}
	
	
	public String toString() {
		return "Butaca a la fila: " + fila + ", seient: " + 
						seient + " reservat per: " + persona;
	}
	
}
