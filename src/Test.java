import java.util.*;

public class Test {

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
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Najveci od tri broja, sa ponavljanjem
		System.out.println("Unesi prvi cijeli broj");
		int a = input.nextInt();
		System.out.println("Unesi drugi cijeli broj");
		int b = input.nextInt();
		System.out.println("Unesi treci cijeli broj");
		int c = input.nextInt();
		
		maxNumber(a, b, c);
		
		System.out.println("Unesi prvi cijeli broj");
		int d = input.nextInt();
		System.out.println("Unesi drugi cijeli broj");
		int e = input.nextInt();
		System.out.println("Unesi treci cijeli broj");
		int f = input.nextInt();
				
		maxNumber(d, e, f);
		
		input.close();
		
		
	}
}
