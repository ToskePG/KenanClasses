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
		
		String s = vratiRijec(14);
		System.out.println(s);
		System.out.println(zbirPrvihNBrojeva(5));
		input.close();
		
		
	}
}
