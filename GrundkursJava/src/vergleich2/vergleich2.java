package vergleich2;

import java.util.Scanner;

public class vergleich2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int zahl1;
		int zahl2;
		int zahl3;
		int zahl4;
		//int zahl5;
		
		System.out.println("Dieses Programm ermittelte die größte aus drei Zahlen.");
		
		System.out.println("Bitte geben Sie die erste Zahl an.");
		zahl1 = scanner.nextInt();
		System.out.println("Die erste Zahl ist die " + zahl1);
		
		System.out.println("Bitte geben Sie die zweite Zahl an.");
		zahl2 = scanner.nextInt();
		System.out.println("Die zweite Zahl ist die " + zahl2);
		
		System.out.println("Bitte geben Sie die dritte Zahl an.");
		zahl3 = scanner.nextInt();
		System.out.println("Die dritte Zahl ist die " + zahl3);
		
		zahl4 = Math.max(zahl1, zahl2);
		//zahl5 = (Math.max(zahl3, zahl4);
		/*if (Math.max(zahl3, zahl4) == zahl3) {
			System.out.println("Die größte Zahl ist die : " + zahl3);
		}
		else {
			System.out.println("Die größte Zahl ist die : " + zahl4);
		}
		*/
		switch (Integer.compare(zahl3, zahl4))  {
		case  1:
			System.out.println("Die größte Zahl ist die : " + zahl3);
			break;
			default : System.out.println("Die größte Zahl ist die : " + zahl4);
			
		}
		scanner.close();

	}

}
