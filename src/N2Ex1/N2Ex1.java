package N2Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class N2Ex1 {public static void main (String[]args) {
	
	Scanner input = new Scanner (System.in);
	Entrada entr = new Entrada();
	
	boolean continueCode;		
	
	do {
		try {
			continueCode = false;
			entr.getByte("How old are you?");
		}catch(InputMismatchException ex) {
			System.out.println("Format error.");
			continueCode = true;
		}
	}while(continueCode);

	do {
		try {
			continueCode = false;
			entr.getInt("What is the result of your age x 2612?");
		}catch(InputMismatchException  ex) {
			System.out.println("Format error.");
			continueCode = true;
		}
	}while(continueCode);
	
	do {
		try {
			continueCode = false;
			entr.getFloat("How much does an apple cost?");
		}catch(InputMismatchException  ex) {
			System.out.println("Format error..");
			continueCode = true;
		}
	}while(continueCode);
	
	do {
		try {
			continueCode = false;
			entr.getDouble("How much does the rent cost?");
		}catch(InputMismatchException  ex) {
			System.out.println("Format error.");
			continueCode = true;
		}
	}while(continueCode);
	
	do {
		try{
			continueCode = false;
			entr.getChar("Write your favorite letter:");
		}catch (Exception ex) {
			System.out.println("Format error.");
			continueCode = true;
		}
	}while(continueCode);
	
	do {
		try {
			continueCode = false;
			entr.getString("Write your name and surname:");
		}catch(Exception  ex) {
			System.out.println("Format error.");
			continueCode = true;
		}
	}while(continueCode);
	
	do {
		try {
			continueCode = false;
			boolean error = entr.getBoolean("Do you have a sister?");
			if ((error == true)||(error == false)) {
				continueCode = false;
			}
		}catch(Exception  ex) {
		System.out.println("Format error.");
		continueCode = true;
			}
	}while(continueCode);
	
}
	
	

}
