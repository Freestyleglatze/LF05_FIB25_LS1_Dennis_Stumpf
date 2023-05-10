
public class MittelwertMitFunktion {

   public static void main(String[] args) {

      // (E) "Eingabe"
      // Werte für x und y festlegen:
      // ===========================
      double x = 2.0;
      double y = 4.0;
      
      double m;
      
      // (V) Verarbeitung
      // Mittelwert von x und y berechnen:
      // ================================
      m = berechneMittelwert(x, y);
      
      // (A) Ausgabe
      // Ergebnis auf der Konsole ausgeben:
      // =================================
      System.out.printf("Der Mittelwert von %.2f und %.2f ist %.2f\n", x, y, m);
   }
   
   // Deklaration der Funktion berechneMittelwert:
   // ===========================================
   static double berechneMittelwert(double x1, double x2) {
      
      double mittelwert;
      
      mittelwert = (x1 + x2) / 2.0;
      
      return mittelwert;
   }
}