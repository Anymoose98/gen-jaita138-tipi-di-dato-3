import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Dichiaro lo scanner
        Scanner sc = new Scanner(System.in);

        // Creo la variabile Boolean per il ciclo while
        boolean available = true;

        while (available) {
            System.out.println("Inserisci il nome");
            String nome = sc.nextLine();

            System.out.println("Inserisci la P.iva");
            String pIva = sc.nextLine();

            System.out.println("Inserisci luogo");
            String luogo = sc.nextLine();

            System.out.println("Inserisci il telefono");
            String telefono = sc.nextLine();

            System.out.println("Inserisci email");
            String email = sc.nextLine();

            System.out.println("Inserisci la lingua principale");
            String lingua = sc.nextLine();

            System.out.println("Inserisci l'iban");
            String iban = sc.nextLine();

            System.out.println("Inserisci il nome referente");
            String nomeReferente = sc.nextLine();

            System.out.println("Inserisci note");
            String note = sc.nextLine();

            // Chiedo un opzione numerica
            System.out.println("Categoria:");
            System.out.println("0 - PIANTE");
            System.out.println("1 - VASELLAME");
            System.out.println("2 - COINCIME");
            System.out.println("3 - GIARDINAGGIO");
            byte categoriaNum = sc.nextByte();

            // Con il file Categoria.java "traduggo" il codice
            Categoria categoria = Categoria.values()[categoriaNum];
            sc.nextLine();

            // Espongo il risultato
            System.out.println("");
            System.out.println("--------------------------------------");

            System.out.println("Si chiama " + nome);
            System.out.println("La sua partita iva è " + pIva);
            System.out.println("Si trova a " + luogo);
            System.out.println("Il suo contatto telefonico è " + telefono);
            System.out.println("La sua email è " + email);
            System.out.println("Parla in lingua " + lingua);
            System.out.println("Il suo iban è " + iban);
            System.out.println("Il nome referente è " + nomeReferente);
            System.out.println("note: " + note);
            System.out.println("Appartiene alla categoria " + categoria);

            // Chiedo se vuole inserire altro con i numeri
            System.out.println("Vuoi inserire un'altro fornitore?");
            System.out.println("0 si");
            System.out.println("1 no");

            // Con il file Risposta.java "traduggo" il codice
            byte rispostaNum = sc.nextByte();
            Risposta risposta = Risposta.values()[rispostaNum];
            sc.nextLine();

            available = false;

            // Controllo la risposta e in base a quello modifico la variabile
            // Usato "==" perché è un confronto tra enum e non semplice stringa
            if (risposta == Risposta.si) {
                available = true;
                System.out.println(available);
            }
        }

        System.out.println("Grazie per aver usato il nostro servizio");
        sc.close();
    }
}
