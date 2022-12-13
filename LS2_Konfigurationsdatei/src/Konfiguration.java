
public class Konfiguration {

	public static void main(String[] args) {
		    		
			int euro;
			int cent;
			int summe;
			int muenzenCent = 1280;
			int muenzenEuro = 130;
			char sprachModul = 'd';
			boolean status;
			final byte PRUEFNR = 4;
			double maximum = 100.00;
			double patrone = 46.24;
			double prozent;
			String typ = "Automat AVR";
			String bezeichnung = "Q2021_FAB_A";
			String name;
			
			summe = muenzenCent + muenzenEuro * 100;
			name = typ + " " + bezeichnung;
			prozent = maximum - patrone;
			euro = summe / 100;
			cent = summe % 100;			
			status = (euro <= 150)&& (sprachModul == 'd')&& (cent != 0)&& (euro >= 50)&& (prozent >= 50.00)&&  (!(PRUEFNR == 5 || PRUEFNR == 6));
			
			System.out.println("Name: " + name);
			System.out.println("Sprache: " + sprachModul);
			System.out.println("Prüfnummer : " + PRUEFNR);
			System.out.println("Füllstand Patrone: " + prozent + " %");
			System.out.println("Summe Euro: " + euro +  " Euro");
			System.out.println("Summe Rest: " + cent +  " Cent");       
			System.out.println("Status: " + status);
			


			
	  
	}

}
