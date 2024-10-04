package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                System.out.print(matrise[i][j] + " ");
            }
            System.out.println();  
        }
    }

	// b)
	public static String tilStreng(int[][] matrise) {
		StringBuilder resultat = new StringBuilder();

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                resultat.append(matrise[i][j]).append(" ");
            }
            resultat.append("\n");
        }

        return resultat.toString();
    }
		 

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int antallRader = matrise.length;
        int antallKolonner = matrise[0].length;
        int[][] skalertMatrise = new int[antallRader][antallKolonner];

        for (int i = 0; i < antallRader; i++) {
            for (int j = 0; j < antallKolonner; j++) {
                skalertMatrise[i][j] = matrise[i][j] * tall;
            }
        }

        return skalertMatrise;
    }
	public static void skrivUtv(int[][] matrise) {                      // oppgave O1-B c
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                System.out.print(matrise[i][j] + " ");
            }
            System.out.println();
        }
    }
		
	
	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length || a[0].length != b[0].length) {
            return false;
        }
         for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
         return true;
    }

	
	// e)
	public static int[][] speile(int[][] matrise) {
		int antallRader = matrise.length;
        int antallKolonner = matrise[0].length;

        int[][] speiletMatrise = new int[antallRader][antallKolonner];

         
        for (int i = 0; i < antallRader; i++) {
            for (int j = 0; j < antallKolonner; j++) {
                speiletMatrise[i][j] = matrise[j][i];      
            }
        }
        return speiletMatrise;
    }
	public static void skrivUtv5(int[][] matrise) {                      // oppgave O1-B e
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                System.out.print(matrise[i][j] + " ");
            }
            System.out.println();           
        }
    }

		 

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int antallRaderA = a.length;
        int antallKolonnerA = a[0].length;
        int antallRaderB = b.length;
        int antallKolonnerB = b[0].length;

         if (antallKolonnerA != antallRaderB) {
            throw new IllegalArgumentException("Antall kolonner i A må være lik antall rader i B.");
        }

         int[][] resultatMatrise = new int[antallRaderA][antallKolonnerB];

         for (int i = 0; i < antallRaderA; i++) {
            for (int j = 0; j < antallKolonnerB; j++) {
                for (int k = 0; k < antallKolonnerA; k++) {
                    resultatMatrise[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return resultatMatrise;
    }
   
    public static void skrivUtvF(int[][] matrise) {                       
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                System.out.print(matrise[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
