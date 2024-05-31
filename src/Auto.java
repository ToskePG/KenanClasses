
public class Auto {
	
	public int godiste;
	public String marka;
	public String model;
	public String tipMenjaca;
	public double kilometraza;
	public double cijena;
	
	public Auto() {
		this.godiste = 1990;
		this.marka = "Opel";
		this.model = "Astra";
		this.tipMenjaca = "Manual";
		this.kilometraza = 0;
		this.cijena = 100;
	}
	
	public Auto(int godiste, String marka, String model, String tipMenjaca, double kilometraza, double cijena) {
		this.godiste = godiste;
		this.marka = marka;
		this.model = model;
		this.tipMenjaca = tipMenjaca;
		this.kilometraza = kilometraza;
		this.cijena = cijena;
	}
	

	@Override
	public String toString() {
		return "Auto [godiste=" + godiste + ", marka=" + marka + ", model=" + model + ", tipMenjaca=" + tipMenjaca
				+ ", kilometraza=" + kilometraza + ", cijena=" + cijena + "]";
	}
	
	public static void resetujKilometrazu(Auto a1) {
		a1.kilometraza = 0;
		System.out.println("Nova je kilometraza je: " +a1.kilometraza);
	}
	
}