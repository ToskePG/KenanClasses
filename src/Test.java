import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// String s = vratiRijec(14);
		// System.out.println(s);
		// System.out.println(zbirPrvihNBrojeva(5));
		// prvihPetBrojeva();
		// System.out.println("Unesi neki broj:");
		// int a = input.nextInt();
		// System.out.println("Prvih " +a  +" brojeva je: ");
		// System.out.println("");
		// prvihNbrojeva(a);
		// unazad();
		// System.out.println(zbirBrojeva(4));
		// int[] nizBrojeva = new int[5];
		// printArray(nizBrojeva);
		// System.out.println("Zbir brojeva u nizu je: ");
		// System.out.println(zbirBrojevaUNizu(nizBrojeva));
		
		
		// Auto a1 = new Auto();
		
		// System.out.println(a1);
		
		// a1.godiste = 2005;
		
		// System.out.println(a1);
		
		System.out.println("Unesi godiste auta: ");
		int godiste = input.nextInt();
		input.nextLine();
		System.out.println("Unesi model auta: ");
		String model = input.nextLine();
		System.out.println("Unesi marku auta: ");
		String marka = input.nextLine();
		System.out.println("Unesi tip menjaca auta: ");
		String tipMenjaca = input.nextLine();
		System.out.println("Unesi kilometrazu auta: ");
		double kilometraza = input.nextDouble();
		System.out.println("Unesi cijenu auta: ");
		double cijena = input.nextDouble();
		
		
		Auto audiA4 = new Auto(godiste, model, marka, tipMenjaca, kilometraza, cijena);
		
		System.out.println(audiA4.toString());
		
		Auto.resetujKilometrazu(audiA4);
		
		System.out.println(audiA4.toString());
		
		
		Auto[] nizAuta = new Auto[5];
		nizAuta[1] = audiA4;
		
		System.out.println(nizAuta[1].toString());
		
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
		
		// Suma prirodnih brojeva od k do n
		public static int sumaBrojeva(int k, int n) {
			int suma = 0;
			for(int i=k; i<=n; i++) {
				suma = suma + i;
			}
			return suma;
		}
		
		// Vraca kvadrat broja
		public static int kvadratBroja(int n) {
			return n*n;
		}
		
		// Suma kvadrata prirodnih brojeva od k do n
		public static int sumaKvadrata(int k, int n) {
			int zbir = 0; 
			for(int i=k; i<=n; i++) {
				// Iskoristicemo funkciju koju smo napravili, primjer kako nam funkcije olaksavaju kod
				zbir = zbir + kvadratBroja(i);
			}
			return zbir;
		}
		
		//  Izračunati i ispisati sumu kvadrata prvih n prirodnih brojeva.
		public static void sumaPrvihNKvadrata(int n) {
			int suma = 0;
			for(int i=0; i<=0; i++) {
				suma += kvadratBroja(i);
			}
			System.out.println(suma);
		}
		
		// Suma kvadrata neparnih prirodnih brojeva od k do n.
		public static int sumaNeparnihBrojeva(int k, int n) {
			int suma = 0;
			for(int i=k; i<=n; i++) {
				// Provjeravamo da li je broj neparan (nije djeljiv sa dva)
				if(i%2!=0) {
					suma = suma + kvadratBroja(i);
				}
			}
			return suma;
		}
		
		// Suma prvih n brojeva
		public static void sumaPrvihBrojeva(int n) {
			// Ne moras uvijek petlju da koristis, neke stvari mozes da smislis formulu, npr ovdje je formula
			// n*(n+1)/2, zbir prvih 10 brojeva je, 10*11/2
			System.out.println(n*(n+1)/2);
		}
		
		// Proizvod prvih 5 prirodnih brojeva.
		public static int proizvodPrvihPetBrojeva() {
			int proizvod = 1;
			for(int i=1; i<=5; i++) {
				proizvod = proizvod * i;
			}
			return proizvod;
		}
		
		// Proizvod brojeva izmedju k i n
		public static int proizvodBrojeva(int k, int n) {
			int proizvod = 1;
			for(int i=k; i<=n; i++) {
				proizvod = proizvod * i;
			}
			return proizvod;
		} 
		
		// Naći proizvod prirodnih brojeva u intervalu od k do n koji su djeljivi sa 2 a nisu djeljivi sa 3.
		public static int solution(int k, int n) {
			int proizvod = 1;
			for (int i=k; i<=n; i++) {
				// Provjeravamo da li je broj i djeljiv sa 2(i%2==0) a nije sa 3(i%3!=0) -> i%3!=0 znaci da je ostatak pri dijeljenju sa 3 razlicit od nule
				if(i%2==0 && i%3!=0) {
					proizvod = proizvod * i;
				}
			}
			return proizvod;
		}
		
		// Izracunati aritmeticku sredinu (Aritmeticka sredina je prosjek, trebace ti za zadatke)
		public static int aritmetickaSredina(int k, int n) {
			// Promenjivoj ne moras uvijek davati vrijednost u startu, za prosjek ti treba suma.
			int aritmetickaSredina;
			int suma = 0;
			for(int i=k; i<n; i++) {
				suma = suma + i;
			}
			// Formula za racunanje prosjeka:
			aritmetickaSredina = suma/(n-k);
			return aritmetickaSredina;
		}
		
		// Koriscenje brojaca, kako prebrojati broj elemenata koji zadovoljavaju neki uslov.
		// Prebroj koliko je brojeva u nizu manje od 10
		public static int brojeviManjiOdDeset(int[] niz) {
			int brojac = 0; // Trenutno imamo 0 prebrojanih elemenata
			// Prolazimo petljom kroz niz, provjeravamo svaki elemenat
			for(int i=0; i<=niz.length; i++) {
				// Da li je trenutni elemenat manji od 15
				if(niz[i]<10) {
					// Ako je manji od 10, povecavamo brojac za 1, u suportnom se nista ne desava.
					brojac++;
				}
			}
			return brojac;
		}
		
		public static int zbirNeparnihPozicija(int[] niz) {
			int zbir = 0;
			for(int i=0; i<=niz.length; i++) {
				if(i%2!=0) {
					zbir= zbir+ niz[i];
				}
			}
			return zbir;
		}
}







