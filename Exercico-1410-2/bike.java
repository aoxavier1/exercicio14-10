public class Bike implements CarbonFootprint {

	private double milhasAno;
	private final int caloriasPorMilha = 34; 
  
  // Calorias que vai gastar por milha! 
	public Bike( double milhas ) {
		milhasAno = milhas;
	}
  
  // GETS E SETS

	public void setMilhasAno( double milhas ) {
		milhasAno = milhas;
	}

	public double getMilhasAno() {
		return milhasAno;
	}

	public String toString() {
		return String.format("%s: %.2f", "Milhas anuais ", getMilhasAno());
	}
	
	public double getCarbonFootprint() {
		return milhasAno * caloriasPorMilha;
	}
}
