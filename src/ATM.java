import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        begruessungText();
        pinEingabe();

    }
    //kundennummer eingabe + begrüßung
    public static void begruessungText() {
        System.out.println("B A N K O M A T EOS-Bank Standort: Hamburg");
        Scanner sc = new Scanner(System.in);
        System.out.print("Hallo, herzlich willkommen " + (kunden()) + "! Bitte geben Sie Ihre Kundennummer an: ");
        int knummer = sc.nextInt();
        if (knummer == 22004) {
            System.out.println("Richtige Kundennummer! Herzlich Willkommen");
        } else {
            System.out.println("Falsche Kontonummer bitte erneut eingeben!");
            begruessungText();
        }
    }

    //kundenliste
    public static String kunden() {
        String kunde = ("Frau Wagner");
        return kunde;
    }
    //passwort eingabe mit 3 versuchen
    public static void pinEingabe(){
        final String PASSWORD = "1234";
        boolean wrongPass = true;

        for (int passAttempts = 0; passAttempts < 3 && wrongPass; passAttempts++) {
            System.out.print("Bitte Passwort eigeben: ");
            Scanner input = new Scanner(System.in);
            String inputPass = input.nextLine();

            if (!(inputPass.equals(PASSWORD))) {
                System.out.println("Bitte Pin erneut eingeben!");
            } else {
                System.out.println("Willkommen");
                wrongPass = false;
                Account wagner = new Account("Frau Wagner", "22004");
                wagner.showMenu();
            }
        }
    }
}










