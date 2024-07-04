package gerade;
import java.util.Scanner;
public class gerade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int zahl;
		int c;
		
		System.out.println("Dieses Programm ermittelt, ob eine Zahl gerade oder ungerade ist.");
		do {
		System.out.println("Bitte geben Sie die gewünschte Zahl ein.");
		
		zahl = scanner.nextInt();
		if (zahl % 2 == 0) {
			System.out.println(zahl + " ist gerade!");}
		else {
			System.out.println(zahl + " ist ungerade!");}
		System.out.println("Wollen Sie eine weiter Zahl eingeben? Drücken Sie '1' für ja.");
		c = scanner.nextInt();
		
		}
		while (c == 1);
		
		System.out.println("Auf Wiedersehen!");
		
		scanner.close();
		}

		
	}


