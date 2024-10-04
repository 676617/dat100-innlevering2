package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);
			if (i < tabell.length - 1) {
	            System.out.print("   ");  
	        } else {
	            System.out.println();
		}       
	}
		 
	}

	// b)
	public static String tilStreng(int[] tabell) {
		if (tabell == null || tabell.length == 0) {
	        return "[]";  
	    }

	    StringBuilder strengBygger = new StringBuilder();
	    strengBygger.append("[");  
	     
	    for (int i = 0; i < tabell.length; i++) {
	        strengBygger.append(tabell[i]);

	        if (i < tabell.length - 1) {              // ?????????
	            strengBygger.append(",");
	        }
	    }
	    strengBygger.append("]");  
	    return strengBygger.toString();  
	}

		 
		

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;

	    for (int i = 0; i < tabell.length; i++) {
	        sum += tabell[i];
	    }
	    return sum;
	}
	public static int summerWhile(int[] tabell) {               // oppgave O1-A c
        int sum = 0;
        int i = 0;

        while (i < tabell.length) {
            sum += tabell[i];
            i++;
        }
        return sum;
    }
	public static int summerForEach(int[] tabell) {             // oppgave O1-A c
        int sum = 0;

        for (int tall : tabell) {
            sum += tall;
        }

        return sum;
    }
	

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
	        if (tabell[i] == tall) {
	            return true;  
	        }
	    }
	    return false;  
	}	

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;  
            }
        }
        return -1;  
    }

		 
	// f)
	public static int[] reverser(int[] tabell) {
		int lengde = tabell.length;
        int[] reversert = new int[lengde];
        
        for (int i = 0; i < lengde; i++) {
            reversert[i] = tabell[lengde - 1 - i];
        }
        
        return reversert;
    }
	public static void skrivUtTabell(int[] tabell) {             // oppgave O1-A f   ---------
        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i] + " ");
        }
 }


	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 1; i < tabell.length; i++)
			if (tabell[i] < tabell[i - 1]) {
				return false;
}
		return true;
}
	
		 

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int lengde1 = tabell1.length;
        int lengde2 = tabell2.length;
        int totalLengde = lengde1 + lengde2;
        
        int[] sammensattTabell = new int[totalLengde];
        
        for (int i = 0; i < lengde1; i++) {
            sammensattTabell[i] = tabell1[i];
        }
        
        for (int i = 0; i < lengde2; i++) {
            sammensattTabell[lengde1 + i] = tabell2[i];
        }
        
        return sammensattTabell;
    }
    
    public static void skrivUtTab(int[] tabell) {                        // oppgave O1-A h ------------
        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i] + " ");
        }
    }
	
	
}
	