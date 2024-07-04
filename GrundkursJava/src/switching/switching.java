package switching;

import java.util.Scanner;

public class switching {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		
		int zahl;
		int wahl;
		
		do {
		System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 9 an!");//Bitte geben Sie eine Zahl zwischen 1 und 9 an!
																				//2
																				//2 liegt im Bereich 0 bis 3!
																				//2 liegt im Bereich 4 bis 6
																				//2 liegt im Bereich 7 bis 9
		zahl = scanner.nextInt();												// Ausgabe ohne breaks
		
		
		switch (zahl) {
		case 0,1,2,3:
			System.out.println(zahl + " liegt im Bereich 0 bis 3!");
		break;
		case 4,5,6:
			System.out.println(zahl + " liegt im Bereich 4 bis 6");
		break;
		case 7,8,9:
			System.out.println(zahl + " liegt im Bereich 7 bis 9");
		break;
		default : System.out.println(zahl + " ist eine ungülige Eingabe. Bitte erneut starten!");
		}
		
		System.out.println("Wollen Sie erneut starten? Drücken sie 1 für ja und 2 für nein!");
		wahl = scanner.nextInt();
		
		} while(wahl == 1);
		
	
		System.out.println("Auf Wiedersehen!");
		
		scanner.close();
	}

}
