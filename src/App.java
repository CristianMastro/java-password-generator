import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci i dati per la tua password sicurissima");

        System.out.println("Inserisci il tuo nome");
        String userName = scan.nextLine();

        System.out.println("Inserisci il tuo cognome");
        String userSurname = scan.nextLine();

        System.out.println("Inserisci il tuo colore preferito");
        String bestColor = scan.nextLine();

        System.out.println("In quale giorno sei nato?(numero)");
        int day = scan.nextInt();

        System.out.println("Di quale mese?(numero)");
        int month = scan.nextInt();

        System.out.println("In quale anno?");
        int year = scan.nextInt();

        System.out.println("La tua password impenetrabile crisè" + " " + userName + "-" + userSurname + "-" + bestColor + "-" + (day + month + year) );

    }
}
