package rente;
import java.util.*;

import primitive.IO;
public class rente {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		double kapital;
		double zinssatz;
		double entnahme;
		double wert;
		int jahr = 0;
		
		System.out.println("Dieses Programm ermittelte wie lange Kapital mit festem Zinssatz für eine jährliche Rentenentnahme reicht.");
		
		
		System.out.println("Bitte geben Sie an wieviel Kapital Sie anlegen wollen.");
		kapital = scanner.nextDouble();
		System.out.println("Das Kapital beträgt :  " + kapital + " Euro");
		
		
		System.out.println("Bitte geben Sie den Zinssatz an.");
		zinssatz = scanner.nextDouble();
		System.out.println("Die Zinssatz beträgt :  " + zinssatz + " %");
		
		
		System.out.println("Bitte geben Sie den Entnahmebetrag an.");
		entnahme = scanner.nextDouble();
		System.out.println("Der jährliche Entnahmebetrag beträgt : " + entnahme + " Euro");
		
		
		if (entnahme > (kapital* zinssatz/100)) {					//wenn nicht wird eine Endlosschleife daraus
			
		
			do {
				wert = (kapital + kapital * (zinssatz/100) - entnahme);
			
					++jahr;
			
						System.out.println("Ihr Kapital nach " + jahr + " Jahr(en) beträgt noch " + IO.round(wert, 2) + " Euro");
			 
							kapital = wert;

				} while( kapital > 0 && kapital > entnahme); 
						System.out.println("Ihr Kapital ist nach " + jahr + " Jahren aufgebraucht! Sie haben einen Restbetrag von " + IO.round(wert, 2) + " Euro");
													}
		else { System.out.println("Der Entnahmebetrag ist zu niedrig!");
			 		}
		
					scanner.close();
			}
		}
	


