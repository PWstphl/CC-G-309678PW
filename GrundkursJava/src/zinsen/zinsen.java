package zinsen;
import java.util.*;
public class zinsen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		double kapital;
		double zinssatz;
		int laufzeit;
		double wert;
		
		System.out.println("Dieses Programm ermittelte die Verzinsung von Kapital mit festem Zinssatz für eine bestimmte Laufzeit.");
		System.out.println("Bitte geben Sie das zu verzinsende Kapital an.");
		kapital = scanner.nextDouble();
		System.out.println("Das Kapital beträgt :  " + kapital + " Euro");
		System.out.println("Bitte geben Sie die Laufzeit in Jahren an.");
		laufzeit = scanner.nextInt();
		System.out.println("Die Laufzeit beträgt : " + laufzeit + " Jahre");
		System.out.println("Bitte geben Sie den Zinssatz an.");
		zinssatz = scanner.nextDouble();
		System.out.println("Die Zinssatz beträgt :  " + zinssatz + " %");
		
		for(int i = 1; i <= laufzeit; i++){
			wert = ((kapital * Math.pow(1+(zinssatz/100), i)));
		       System.out.println("Wert nach " + i + " Jahr: " + (IO.round(wert, 2) + " Euro"));
		     }
		scanner.close();

	}

}
