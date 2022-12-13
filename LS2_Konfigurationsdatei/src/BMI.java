import java.util.Scanner;
public class BMI {
  public static void main(String[] args) {
    // Erstellt einen Scanner Objekt für den Input
    Scanner scanner = new Scanner(System.in);

    // Geschlecht, Größe und Gewicht von dem Anwender kriegen
    System.out.print("Geben Sie bitte Ihr Geschlecht ein (in m oder w): ");
    String geschlecht = scanner.nextLine();
    System.out.print("Geben Sie bitte Ihre Körpergröße in Metern ein: ");
    double größe = scanner.nextDouble();
    System.out.print("Gebe Sie bitte Ihr Gewicht in Kilogramm ein: ");
    double gewicht = scanner.nextDouble();

    // Berechnet den BMI
    double bmi = gewicht / (größe * größe);

    // Ausgabe vom Ergebnis
    if (geschlecht.equalsIgnoreCase("m")) {
      if (bmi < 20) {
        System.out.println("Ihr BMI beträgt: " + bmi + ", was für einen Mann als untergewichtig gilt.");
      } else if (bmi >= 20 && bmi < 25) {
        System.out.println("Ihr BMI beträgt: " + bmi + ", was für einen Mann als normalgewichtig gilt.");
      } else if (bmi >= 25 && bmi < 30) {
        System.out.println("Ihr BMI beträgt: " + bmi + ", was für einen Mann als übergewichtig gilt.");
      } else {
        System.out.println("Ihr BMI beträgt: " + bmi + ", was für einen Mann als fettleibig gilt.");
      }
    } else if (geschlecht.equalsIgnoreCase("w")) {
      if (bmi < 19) {
        System.out.println("Ihr BMI beträgt: " + bmi + ", was für eine Frau als untergewichtig gilt.");
      } else if (bmi >= 19 && bmi < 24) {
        System.out.println("Ihr BMI beträgt: " + bmi + ", was für eine Frau als normalgewichtig gilt.");
      } else if (bmi >= 24 && bmi < 30) {
        System.out.println("Ihr BMI beträgt: " + bmi + ", was für eine Frau als übergewichtig gilt.");
      } else {
        System.out.println("Ihr BMI beträgt: " + bmi + ", was für eine Frau als fettleibig gilt.");
      }
    }
  }
}