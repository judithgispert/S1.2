package N2Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	
	public static void main (String[]args) {
		
		Scanner input = new Scanner (System.in);
		
		boolean continueCode;		
		
		do {
			try {
				continueCode = false;
				getByte("Write a number between -128 and 127:");
			}catch(InputMismatchException ex) {
				System.out.println("Format error.");
				continueCode = true;
			}
		}while(continueCode);
	
		do {
			try {
				continueCode = false;
				getInt("Write a number between -2^31 and 2^31-1:");
			}catch(InputMismatchException  ex) {
				System.out.println("Format error.");
				continueCode = true;
			}
		}while(continueCode);
		
		do {
			try {
				continueCode = false;
				getFloat("Write a number with coma:");
			}catch(InputMismatchException  ex) {
				System.out.println("Format error..");
				continueCode = true;
			}
		}while(continueCode);
		
		do {
			try {
				continueCode = false;
				getDouble("Write a number with coma:");
			}catch(InputMismatchException  ex) {
				System.out.println("Format error.");
				continueCode = true;
			}
		}while(continueCode);
		
		do {
			try{
				continueCode = false;
				getChar("Write a character:");
			}catch (Exception ex) {
				System.out.println("Format error.");
				continueCode = true;
			}
		}while(continueCode);
		
		do {
			try {
				continueCode = false;
				getString("Write a sentence:");
			}catch(Exception  ex) {
				System.out.println("Format error.");
				continueCode = true;
			}
		}while(continueCode);
		
		do {
			try {
				continueCode = false;
				boolean error = getBoolean("Do you have a sister?");
				if ((error == true)||(error == false)) {
					continueCode = false;
				}
			}catch(Exception  ex) {
			System.out.println("Format error.");
			continueCode = true;
				}
		}while(continueCode);
		
		
		
		
		
		
	}
	public static byte getByte (String missatge) {
		Scanner input = new Scanner (System.in);
		System.out.println(missatge);
		return input.nextByte();
	}
	public static int getInt (String missatge) {
		Scanner input = new Scanner (System.in);
		System.out.println(missatge);
		return input.nextInt();
	}
	public static float getFloat (String missatge) {
		Scanner input = new Scanner (System.in);
		System.out.println(missatge);
		return input.nextFloat();
	}
	public static double getDouble (String missatge) {
		Scanner input = new Scanner (System.in);
		System.out.println(missatge);
		return input.nextDouble();
	}
	
	public static char getChar (String missatge) throws Exception{
		Scanner input = new Scanner (System.in);
		System.out.println(missatge);
		String charGet = input.nextLine();
		char oneChar;
		
		if (charGet.length()==1) {
			oneChar= charGet.charAt(0);
		}else {
			throw new Exception();
		}
		return oneChar;
	}
	
	public static String getString (String missatge) {
		Scanner input = new Scanner (System.in);
		System.out.println(missatge);
		return input.nextLine();
	}
	public static boolean getBoolean (String missatge) throws Exception{
		Scanner input = new Scanner (System.in);
		System.out.println(missatge);
		char answer = input.nextLine().charAt(0);
		boolean returnTF = false;
		if ((answer == 'y')||(answer == 'Y')) {
			returnTF = true;
		}else if((answer == 'n')||(answer == 'N')) {
			returnTF = false;
		}else {
			throw new Exception();
		}
		return returnTF;
	}
}
