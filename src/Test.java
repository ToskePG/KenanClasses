import java.util.*;

public class Test {
	
	// Za uneseni broj n da vraca zbir prvih n brojva (npr ako je n=5, treba vratiti 15 jer je 5+4+3+2+1 = 15)
	public static int zbirPrvihNBrojeva(int n) {
		int zbir = 0;
		for(int i=1; i<=n; i++) {
			zbir = zbir + i;
		}
		return zbir;
	}
	
	// Ako je a vece od 10 vrati recenicu A je vece od 10, u suportnom vrati rijec false
	public static String vratiRijec(int a) {
		if(a > 10) {
			return "A je vece od 10";
		}
		return "False";
	}

	public static void maxNumber(int a, int b, int c) {
		// Najveci od tri broja, bez ponavljanja
				if(a>b) {
					if(a>c) {
						System.out.println("Najveci broj je " +a);
					}else if(a == c) {
						System.out.println("Brojevi a i c imaju najvecu vrijednost: " +a);
					}else {
						System.out.println("Najveic broj je: " +c);
					}
				}else if(a == b) {
					if(a>c) {
						System.out.println("Brojevi a, b imaju najvecu vrijednost: " +a);
					}else if(a == c) {
						System.out.println("Brojevi a, b, c imaju vrijednost: " +a);
					}else {
						System.out.println("Najveic broj je: " +c);
					}
				}else {
					if(b>c) {
						System.out.println("Najveci broj je: " +b);
					}else if(b == c) {
						System.out.println("Brojevi b, c imaju istu vrijednost: " +b);
					}else {
						System.out.println("Broj c ima najvecu vrijednost: " +c);
					}
				}
	}
	
	// Ako je broj a veci od 10 ostampaj rezultat b+c*d, ako je a tacno 10 ostampaj b+c+d, u ostalim slucajevima ostampaj rezultat b*c*d
	public static void rezultat(int a, int b, int c, int d) {
		if(a>10) {
			System.out.println(a+c*d);
		}else if(a == 10) {
			System.out.println(b+c+d);
		}else {
			System.out.println(b*c*d);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// String s = vratiRijec(14);
		// System.out.println(s);
		// System.out.println(zbirPrvihNBrojeva(5));
		//prvihPetBrojeva();
		//System.out.println("Unesi neki broj:");
		//int a = input.nextInt();
		//System.out.println("Prvih " +a  +" brojeva je: ");
		//System.out.println("");
		//prvihNbrojeva(a);
		//unazad();
		//System.out.println(zbirBrojeva(4));
		
		int[] nizBrojeva = new int[5];
		
		for(int i = 0; i <= nizBrojeva.length-1; i++) {
			System.out.println("Unesi " +(i+1) +". clan niza: ");
			nizBrojeva[i] = input.nextInt();
		}
		
		printArray(nizBrojeva);
		
		System.out.println("Zbir brojeva u nizu je: ");
		
		System.out.println(zbirBrojevaUNizu(nizBrojeva));
		
		
		input.close();
	}
	
	public static void prvihPetBrojeva() {
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
		}
	}
	
	public static void prvihNbrojeva(int n) {
		for(int i = 1; i<= n; i++) {
			System.out.println(i);
		}
	}
	
	public static void unazad() {
		for(int i = 5; i>=1; i--) {
			System.out.println(i);
		}
	}
	
	public static void parniBrojevi(int n) {
		for(int i = 1; i <= n; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	public static int zbirBrojeva(int n) {
		int zbir = 0;
		for(int i = 0; i<=n; i++) {
			zbir = zbir+i;
		}
		return zbir;
	}
	
	public static void printArray(int[] niz) {
		for(int i=0; i<=niz.length-1; i++) {
			System.out.println((i+1) +". clan niza je: ");
			System.out.println(niz[i]);
		}
		System.out.println("");
	}
	
	public static int zbirBrojevaUNizu(int[] niz) {
		int zbir = 0;
		for(int i=0; i<=niz.length-1; i++) {
			zbir = zbir + niz[i];
		}
		return zbir;
	}
}














