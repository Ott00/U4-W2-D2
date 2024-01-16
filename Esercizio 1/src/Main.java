import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> parole = new HashSet<>();
        Set<String> duplicati = new HashSet<>();

        /* PUNTO 1 ESERCIZIO */
        System.out.println("Quante parole vuoi inserire?");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci la " + (i + 1) + "° parola");
            String parola = scanner.nextLine();
            if (!parole.add(parola)) {
                duplicati.add(parola);
            }
        }
        System.out.println("Le parole duplicate sono: " + duplicati);

        /* PUNTO 2 ESERCIZIO */
        int numeroParoleDistinte = parole.size() - duplicati.size();
        System.out.println("Il numero di parole distinte sono: " + numeroParoleDistinte);

        /* PUNTO 3 ESERCIZIO */
        List<String> distinte = new ArrayList<>();
        for (String parola : parole) {
            if (!duplicati.contains(parola))
                distinte.add(parola);
        }
        System.out.println("Le parole distinte sono: " + distinte);
    }
}