package N3Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Cine {
	
	private int numFiles;
	private int numSeientsFila;
	private GestioButaques gestioButaques;
	
	public Cine() {
		gestioButaques = new GestioButaques();
		demanarDadesInicials();
	}
	
	
	public static int demanarInt (String missatge) {
		Scanner input = new Scanner (System.in);
		System.out.println(missatge);
		return input.nextInt();
	}
	public static String demanarString (String missatge) {
		Scanner input = new Scanner (System.in);
		System.out.println(missatge);
		return input.nextLine();
	}
	
	
	public void demanarDadesInicials() {
		numFiles = demanarInt("Introdueix el número de files que hi ha a la sala:");
		numSeientsFila = demanarInt("Introdueix el número de seients que hi ha a cada fila:");
	}
	
	
	public void iniciar() {
		boolean app = true;
		
		do {
			switch (menu()) {
			case 1:
				mostrarButaques();
				break;
				
			case 2:
				mostrarButaquesPersona();
				break;
				
			case 3:
				reservarButaca();
				break;
				
			case 4: 
				anularReserva();
				break;
				
			case 5:
				anularReservaPersona();
				break;
				
			case 0:
				app = false;
				break;
			
			}
			
		}while(app = true);
		
		System.out.println("S'està tancant l'aplicació.");
	}
	
	
	private int menu() {
		
		System.out.println("MENÚ DE L'APLICACIÓ:");
		System.out.println("1. Mostrar totes les butaques reservades.");
		System.out.println("2. Mostrar les butaques reservades per una persona.");
		System.out.println("3. Reservar una butaca.");
		System.out.println("4. Anul·lar la reserva d’una butaca.");
		System.out.println("5. Anul·lar totes les reserves d’una persona.");
		System.out.println("0. Sortir.");
		
		int idmenu = demanarInt("Escriu el número de l'apartat al que vulguis accedir:");
		
		return idmenu;
	}
	
	
	private void mostrarButaques() {
		ArrayList<Butaca> llistaButaques = gestioButaques.getLlistaButaques();
		
		if (!llistaButaques.isEmpty()){
			for(Butaca butaca : llistaButaques) {
			System.out.println(butaca);
			}
		} else {
			System.out.println("No hi ha butaques reservades.");
		}
	}
	
	
	private void mostrarButaquesPersona() {
		ArrayList<Butaca> llistaButaques = gestioButaques.getLlistaButaques();
		String persona = demanarString("Nom de la persona que té les entrades reservades:");
		
		if(!llistaButaques.isEmpty()) {
			for(Butaca butaca : llistaButaques) {
				if(butaca.getPersona().equalsIgnoreCase(persona)) {
					System.out.println(butaca);
				}
			}
		}else {
			System.out.println("No hi ha butaques reservades per aquesta persona.");
		}
	}
	
	
	private int introduirFila() throws ExcepcioFilaIncorrecta{
		int fila = demanarInt("Introdueix el número de la fila:");
		if (fila <= 0 || fila > numFiles) {
			throw new ExcepcioFilaIncorrecta();
		}
		return fila;
	}
	private int introduirSeient() throws ExcepcioSeientIncorrecte{
		int seient = demanarInt("Introdueix el número del seient:");
		if(seient <= 0 || seient > numSeientsFila) {
			throw new ExcepcioSeientIncorrecte();
		}
		return seient;
	}
	private String introduirPersona() throws ExcepcioNomPersonaIncorrecte{
		String persona = demanarString("Introdueix el nom:");
	
		for (int cont = 0; cont < persona.length()-1; cont++) {
			char lletraNom = persona.charAt(cont);
			if (!Character.isDigit(lletraNom)) {
				throw new ExcepcioNomPersonaIncorrecte();
			}
		} 
		return persona;
	}
	
	private void reservarButaca() {
		try {
			int fila = introduirFila();
			int seient = introduirSeient();
			String persona = introduirPersona();
			
			gestioButaques.afegirButaca(new Butaca (fila, seient, persona));
			System.out.println("Butaca reservada.");
			
		} catch (ExcepcioFilaIncorrecta | ExcepcioSeientIncorrecte | 
				ExcepcioNomPersonaIncorrecte | ExcepcioButacaOcupada ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	private void anularReserva() {
		try {
			int fila = introduirFila();
			int seient = introduirSeient();
			
			gestioButaques.eliminarButaca(fila, seient);
			System.out.println("Reserva anulada.");
		} catch (ExcepcioFilaIncorrecta | ExcepcioSeientIncorrecte | ExcepcioButacaLliure ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	private void anularReservaPersona() {
		ArrayList<Butaca> llistaButaques = gestioButaques.getLlistaButaques();
		
		try {
			String persona = introduirPersona();
			int fila = introduirFila();
			int seient = introduirSeient();
			
			if(!llistaButaques.isEmpty()){
				for (Butaca butaca : llistaButaques) {
					if(butaca.getPersona().equalsIgnoreCase(persona)) {
						gestioButaques.eliminarButaca(fila, seient);
						System.out.println("Reserva anulada.");
					}
				}
			}else {
				System.out.println("No hi ha reserves.");
			}
		} catch(ExcepcioFilaIncorrecta | ExcepcioSeientIncorrecte | 
				ExcepcioNomPersonaIncorrecte | ExcepcioButacaLliure ex) {
			System.out.println(ex.getMessage());
		}
	
	
	}

}
