
import java.util.Scanner;

public class Fahrkartenautomat {

	static void begreussung() {
		System.out.println("Herzlich Willkommen! \n");
	}

	
	
	public static double fahrkartenbestellungErfassen(Scanner tastatur) {
		double[] price = {2.00, 3.00, 8.80, 9.40};
		String[] fahrkarte = {"Kurzstrecke AB", "Einzelfahrschein AB", "Tageskarte AB", "4-Fahrten-Karte AB"};
		double zuZahlenderBetrag = 0;
		int ticket;
		double anzahlTickets;
		
		
		System.out.printf("Wählen Sie ihre Wunschfahrkarte aus");
		for(int i= 0; i<fahrkarte.length; i++) {
			System.out.printf("\n%-25s [%.2f] ("+i+")",fahrkarte[i] ,price[i]);
		}
		
		
		//System.out.printf(
		//		"Wählen Sie ihre Wunschfahrkarte für" + fahrkarte[0] + " aus:\n Kurzstrecke AB [2,00 EUR] (1)\n Einzelfahrschein AB [3,00 EUR] (2)\n Tageskarte AB [8,80 EUR] (3)\n 4-Fahrten-Karte AB [9,40 EUR] (4)\n\n");
		System.out.printf("\nIhre Wahl: ");
		ticket = tastatur.nextInt();
		while (ticket > 4 || ticket < 0) {
			System.out.println(">> falsche Eingabe <<");
			System.out.print("Ihre Wahl: ");
			ticket = tastatur.nextInt();
		}
		switch (ticket) {
		case 1:
			zuZahlenderBetrag = price[0];
			break;
		case 2:
			zuZahlenderBetrag = price[1];
			break;
		case 3:
			zuZahlenderBetrag = price[2];
			break;
		case 4:
			zuZahlenderBetrag = price[3];
			break;
		default:
			System.out.println(">> falsche Eingabe <<");
		}

		// 2 Ticketanzahl eingeben
		System.out.print("Anzahl der Tickets: ");
		anzahlTickets = tastatur.nextDouble();

		while (anzahlTickets <= 0 || anzahlTickets > 10) {
			System.out.print(">> Whälen Sie bitte eine Anzahl von 1 bis 10 Tickets aus <<\n");
			System.out.print("\nAnzahl der Tickets: ");
			anzahlTickets = tastatur.nextDouble();
		}
		zuZahlenderBetrag = zuZahlenderBetrag * anzahlTickets;
		return zuZahlenderBetrag;
	}

	public static double fahrkartenBezahlen(Scanner tastatur, double zuZahlenderBetrag) {

		double eingezahlterGesamtbetrag;
		double nochZuZahlen;
		double eingeworfeneMuenze;

		eingezahlterGesamtbetrag = 0.0;
		nochZuZahlen = 0.0;
		while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
			nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
			System.out.printf("Noch zu zahlen: %.2f Euro\n", nochZuZahlen);
			System.out.print("Eingabe (mind. 5 Cent, höchstens 20 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();

			if (eingeworfeneMuenze == 0.05) {
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			} else if (eingeworfeneMuenze == 0.10) {
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			} else if (eingeworfeneMuenze == 0.20) {
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			} else if (eingeworfeneMuenze == 0.50) {
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			} else if (eingeworfeneMuenze == 1.00) {
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			} else if (eingeworfeneMuenze == 2.00) {
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			} else if (eingeworfeneMuenze == 5.00) {
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			} else if (eingeworfeneMuenze == 10.00) {
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			} else if (eingeworfeneMuenze == 20.00) {
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			} else {
				System.out.println("Kein gültiges Zahlungsmittel");
			}

		}
		return eingezahlterGesamtbetrag;
		
	}

	public static void fahrkartenBezahlen() {

		System.out.println("\nFahrschein wird ausgegeben");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
	}

	public static void rueckgeldAusgeben(double zuZahlenderBetrag, double eingezahlterGesamtbetrag) {

		double rueckgabebetrag;

		rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
		if (rueckgabebetrag > 0.0) {
			System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro\n", rueckgabebetrag);
			System.out.println("wird in folgenden Münzen ausgezahlt:");

			while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
				System.out.println("2 Euro");
				rueckgabebetrag = rueckgabebetrag - 2.0;
				rueckgabebetrag = Math.round(rueckgabebetrag * 100) / 100.0;
			}
			while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
				System.out.println("1 Euro");
				rueckgabebetrag = rueckgabebetrag - 1.0;
				rueckgabebetrag = Math.round(rueckgabebetrag * 100) / 100.0;
			}
			while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
				System.out.println("50 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.5;
				rueckgabebetrag = Math.round(rueckgabebetrag * 100) / 100.0;
			}
			while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
				System.out.println("20 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.2;
				rueckgabebetrag = Math.round(rueckgabebetrag * 100) / 100.0;
			}
			while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
				System.out.println("10 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.1;
				rueckgabebetrag = Math.round(rueckgabebetrag * 100) / 100.0;
			}
			while (rueckgabebetrag >= 0.05) { // 5-Cent-Münzen
				System.out.println("5 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.05;
				rueckgabebetrag = Math.round(rueckgabebetrag * 100) / 100.0;
			}
		}

		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");
}	
	
	
	
	public static void main(String[] args) {

		double zuZahlenderBetrag;
		double eingezahlterGesamtbetrag;

		Scanner tastatur = new Scanner(System.in);

		begreussung();

		zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur);
		eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur, zuZahlenderBetrag);
		fahrkartenBezahlen();
		rueckgeldAusgeben(zuZahlenderBetrag, eingezahlterGesamtbetrag);
		tastatur.close();
	}
}
